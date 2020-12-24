package chinobot.threadtest.componet;


import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

//import org.dom4j.DocumentException;
//import org.dom4j.DocumentHelper;
//import org.jdom.JDOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;





public class XmlUtil {
	private static final DocumentBuilderFactory DOCUMENT_BUILDER_FACTORY = DocumentBuilderFactory.newInstance();

	public XmlUtil() {}

	/**
	 * 把Document对象转为字符串
	 * 
	 * @return
	 */
	public static String outXMLData(Document document) {
		return getStringFromDocument(document);
	}

	/**
	 * 
	 * @param rootName
	 *            xml根节点名称
	 * @param secondName
	 *            xml二级节点名称
	 * @param outList 输出参数集合
	 *        inList	输入参数集合
	 * @return xml字符串
	 * @throws ParserConfigurationException
	 */
	public String outXMLData(List inList) throws ParserConfigurationException {
		Document doc = DOCUMENT_BUILDER_FACTORY.newDocumentBuilder().newDocument();
		Element root = doc.createElement("QueryExpression");
		Element secondEle = doc.createElement("Fields");
		
		Element sEle = doc.createElement("Conditions");
		if(inList.size()>0)
		{
			for (int i = 0; i < inList.size(); i++) {
				Map map = (Map)inList.get(i);
				//添加子节点
				Iterator it = map.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry entry = (Map.Entry) it.next();
					String key = (String)entry.getKey();
					String value = (String)entry.getValue();
					if("".equals(key))
					{
						continue;
					}
					Element thirdEle = doc.createElement("Condition");
					Element temp = doc.createElement("ResIndexName");
					Text textNode = doc.createTextNode(stripNonValidXMLCharacters(key));
					temp.appendChild(textNode);
					thirdEle.appendChild(temp);
					Element tempOperation = doc.createElement("Operation");
					Text textNodeOperation = doc.createTextNode("=");
					tempOperation.appendChild(textNodeOperation);
					thirdEle.appendChild(tempOperation);
					Element tempRightValue = doc.createElement("RightValue");
					Text textNodeRightValue = doc.createTextNode(stripNonValidXMLCharacters(value));
					tempRightValue.appendChild(textNodeRightValue);
					thirdEle.appendChild(tempRightValue);
					sEle.appendChild(thirdEle);
				}
			}
		}
		root.appendChild(secondEle);
		root.appendChild(sEle);
		doc.appendChild(root);
		//System.out.print(outXMLData(doc).getBytes("UTF-8"));
		// return encoder.encode(outXMLData(doc).getBytes("UTF-8"));
		return outXMLData(doc);
	}
	/**
	 * 把字符串转为Document对象
	 * 
	 * @return
	 * @throws IOException
	 * @throws JDOMException
	 */
	public static Document parseXMLDocument(String xmlStr) {
		return getDocument(xmlStr);
	}

	/**
	 * 把字符串转为<List><Map>对象
	 * 
	 * @return
	 * @throws IOException
	 * @throws JDOMException
	 */
	public static List parseXMLToList(String xmlStr) {
		// BASE64Decoder decoder = new BASE64Decoder();
		// try {
		// xmlStr = new String(decoder.decodeBuffer(xmlStr));
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		Document doc = parseXMLDocument(xmlStr);
		Node tempRoot = doc.getFirstChild();// DataSet
		NodeList rows = tempRoot.getChildNodes();// DataSet->(ListContent或SubList)
		List list = new LinkedList();
		for (int i = 0; i < rows.getLength(); i++) {
			Node element = (Node) rows.item(i);
			NodeList columns = element.getChildNodes();
			Map rec = new HashMap();
			for (int j = 0; j < columns.getLength(); j++) {
				Node tempElement = (Node) columns.item(j);
				NodeList tempcolumns = tempElement.getChildNodes();
				Map map = new HashMap();
				for (int k = 0; k < tempcolumns.getLength(); k++) {
					Node lastElement = (Node) tempcolumns.item(k);
					String name = lastElement.getNodeName();
					String value = "";
					if (lastElement.getFirstChild() != null) value = lastElement.getFirstChild().getNodeValue();
					map.put(name, value);
				}
				rec.put(map.get("ResIndex"), map.get("Value"));
			}
			list.add(rec);
		}
		return list;
	}
	
	
	
	
	/**
	 * 把字符串转为<List><Map>对象(取值为大写)
	 * 
	 * @return
	 * @throws IOException
	 * @throws JDOMException
	 */
	public static List parseXMLToListByCapital(String xmlStr) {
		// BASE64Decoder decoder = new BASE64Decoder();
		// try {
		// xmlStr = new String(decoder.decodeBuffer(xmlStr));
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		Document doc = parseXMLDocument(xmlStr);
		Node tempRoot = doc.getFirstChild();// DataSet
		NodeList rows = tempRoot.getChildNodes();// DataSet->(ListContent或SubList)
		List list = new LinkedList();
		for (int i = 0; i < rows.getLength(); i++) {
			Node element = (Node) rows.item(i);
			NodeList columns = element.getChildNodes();
			Map rec = new HashMap();
			for (int j = 0; j < columns.getLength(); j++) {
				Node tempElement = (Node) columns.item(j);
				NodeList tempcolumns = tempElement.getChildNodes();
				Map map = new HashMap();
				for (int k = 0; k < tempcolumns.getLength(); k++) {
					Node lastElement = (Node) tempcolumns.item(k);
					String name = lastElement.getNodeName();
					String value = "";
					if (lastElement.getFirstChild() != null) value = lastElement.getFirstChild().getNodeValue();
					map.put(name, value);
				}
				rec.put(map.get("RESINDEX"), map.get("VALUE"));
			}
			list.add(rec);
		}
		return list;
	}
	/**
	 * 过滤特殊字符
	 * 
	 * @param in
	 * @return
	 */
	public String stripNonValidXMLCharacters(String in) {
		StringBuffer out = new StringBuffer(); // Used to hold the output.
		char current; // Used to reference the current character.
		if (in == null || ("".equals(in))) return ""; // vacancy test.
		for (int i = 0; i < in.length(); i++) {
			current = in.charAt(i);
			if ((current == 0x9) || (current == 0xA) || (current == 0xD) || ((current >= 0x20) && (current <= 0xD7FF)) || ((current >= 0xE000) && (current <= 0xFFFD)) || ((current >= 0x10000) && (current <= 0x10FFFF))) out.append(current);
		}
		return out.toString();
	}
	/**
	 * 将xml转换成String
	 * 描述:
	 * @param doc
	 * @return
	 * @author: pengl
	 * @最后操作时间: 2014-3-3 下午05:37:50
	 * @备注:
	 */
	public static String getStringFromDocument(Document doc) {
		DOMSource domSource = new DOMSource(doc);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = tf.newTransformer();
			transformer.transform(domSource, result);
		} catch (Exception e) {
			throw new IllegalStateException();
		}

		return writer.toString();
	}
	/**
	 * 
	 * 描述:将String转换成xml
	 * @param xmlString
	 * @return
	 * @author: pengl
	 * @最后操作时间: 2014-3-3 下午05:38:11
	 * @备注:
	 */
	public static Document getDocument(String xmlString) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(xmlString));
			return builder.parse(is);
		} catch (ParserConfigurationException e) {
			throw new IllegalStateException();
		} catch (SAXException e) {
			throw new IllegalStateException();
		} catch (IOException e) {
			throw new IllegalStateException();
		}

	}
	
	 /**
	  *
	  * <p>
	  * Description:解析XML<br />
	  * </p>
	  * @author gang.li
	  * @version 0.1 2013年9月12日
	  * @param xml
	  * @return
	  * Map<String,Object>
	  */
	/* @SuppressWarnings("unchecked")
	 public static Map<String,Object> getResult(String xml){
		  Map<String,Object> map = new HashMap<String, Object>();
		  try {
			   org.dom4j.Document document = DocumentHelper.parseText(xml);
			   org.dom4j.Element root = document.getRootElement();
			   Iterator<org.dom4j.Element> it = root.elementIterator();
			   while (it.hasNext()) {
				org.dom4j.Element element = it.next();
			    map.put(element.getName(), element.getTextTrim());
			   }
		  } catch (DocumentException e) {
			  e.printStackTrace();
		  }
		  return map;
	 }*/
	 
	 /**
	  *
	  * <p>
	  * Description:解析XML<br />
	  * </p>
	  * @author gang.li
	  * @version 0.1 2013年9月12日
	  * @param xml
	  * @return
	  * Map<String,Object>
	  */
	/* public static Map<String,Object> elementToMap(org.dom4j.Element root){
		  Map<String,Object> map = new HashMap<String, Object>();
		  try {
			   Iterator<org.dom4j.Element> it = root.elementIterator();
			   while (it.hasNext()) {
				org.dom4j.Element element = it.next();
			    map.put(element.getName(), element.getTextTrim());
			   }
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
		  return map;
	 }*/
	 
	 
	
	public static void main(String [] a)
	{
		XmlUtil x=new XmlUtil();
//		List list = parseXMLToList("<?xml version=\"1.0\" encoding=\"UTF-8\"?><QueryExpression><Fields><Field><ResIndexName>姓名</ResIndexName><FieldEnName>XM</FieldEnName><FieldDataType>字符</FieldDataType></Field><Field><ResIndexName>身份证号码</ResIndexName><FieldEnName>ZJH</FieldEnName><FieldDataType>字符</FieldDataType></Field><Field>	<ResIndexName>项目名称（小区名称）</ResIndexName><FieldEnName>FDCMC</FieldEnName>	<FieldDataType>字符</FieldDataType></Field><Field><ResIndexName>建筑面积</ResIndexName><FieldEnName>JZMJ</FieldEnName><FieldDataType>数字</FieldDataType></Field><Field><ResIndexName>购房性质</ResIndexName><FieldEnName>GFXZ</FieldEnName><FieldDataType>字符</FieldDataType></Field><Field><ResIndexName>房屋用途</ResIndexName><FieldEnName>FWYT</FieldEnName><FieldDataType>字符</FieldDataType></Field><Field><ResIndexName>购买时间</ResIndexName><FieldEnName>GMSJ</FieldEnName><FieldDataType>字符</FieldDataType></Field><Field><ResIndexName>转出时间</ResIndexName><FieldEnName>ZCSJ</FieldEnName><FieldDataType>字符</FieldDataType></Field><Field><ResIndexName>份额</ResIndexName><FieldEnName>FE</FieldEnName><FieldDataType>字符</FieldDataType></Field><Field><ResIndexName>合同交易价格</ResIndexName><FieldEnName>JYJG</FieldEnName><FieldDataType>数字</FieldDataType></Field><Field><ResIndexName>币种</ResIndexName><FieldEnName>BIZ</FieldEnName><FieldDataType>字符</FieldDataType></Field><Field><ResIndexName>房屋评估价格</ResIndexName><FieldEnName>FWPGJG</FieldEnName><FieldDataType>数字</FieldDataType></Field><Field><ResIndexName>业务类别</ResIndexName><FieldEnName>YWLB</FieldEnName><FieldDataType>字符</FieldDataType></Field></Fields><Conditions><Condition><ResIndexName>IDNO18</ResIndexName><Operation>=</Operation><RightValue>36250219790830262X</RightValue></Condition><Condition><ResIndexName>IDNO15</ResIndexName><Operation>=</Operation><RightValue>36250219790830262X</RightValue></Condition><Condition><ResIndexName>DATE</ResIndexName><Operation>=</Operation><RightValue>1980-01-01</RightValue></Condition></Conditions></QueryExpression>");
//		System.out.println(list);
		List list = new ArrayList();
		Map map = new HashMap();
		map.put("a", "a");
		map.put("b", "b");
		map.put("c", "c");
		map.put("d", "d");
		Map map2 = new HashMap();
		map2.put("a", "a");
		map2.put("b", "b");
		map2.put("c", "c");
		map2.put("d", "d");
		list.add(map);
		list.add(map2);
		System.out.println(list);
		try {
			String string = x.outXMLData(list);
			System.out.println(string);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

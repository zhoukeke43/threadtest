package chinobot.threadtest.componet;

import java.net.URL;
import java.util.*;
import java.util.concurrent.*;

import chinobot.threadtest.entity.CheckResult;
import chinobot.threadtest.entity.Person;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class CheckUtils {

    //核查的接口地址
    private static final String url="http://61.144.226.2:8091/CommServer/services/dataService?wsdl";//接口webservice的url地址
    private static int threadMax=10;

    public static String invokeMethods(String methodName,List<Map<String, String>> dataList) throws Exception {
        String ret=null;
        try {

            String xmlstr = new XmlUtil().outXMLData(dataList);
            String endpoint = url;
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new URL(endpoint));
            call.setOperationName(methodName);
            ret = (String) call.invoke(new Object[]{xmlstr});

            System.out.println("调用一次" + ret + new Date());
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return ret;
    }

    public static List CheckSB(List<Person> personList) throws Exception{

        List<CheckResult> checkResultList=new ArrayList<>();
        CountDownLatch latch = new CountDownLatch(personList.size());
        ExecutorService executorService= Executors.newFixedThreadPool(threadMax);

        for (Person person:personList) {

            //CompletableFuture future=new CompletableFuture();

            //new MyCallable(person,checkResultList,latch).call();

           Future<CheckResult>  future= executorService.submit(new MyCallable(person,checkResultList,latch));
           future.isDone();


        }

        latch.await();
        executorService.shutdown();

        System.out.println("核查完毕");

        return checkResultList;




    }

    /*
    List<Map<String, String>> inList = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        // map.put("ID_NO", "362429197809205343");
        map.put("S_NO", "103526493");
        map.put("NAME", "王小敏");
        // /map.put("EXCLUDE_YANGL", "N");// 不排除养老保险
        // map.put("EXCLUDE_YUL", "N");// 不排除医疗保险
        // map.put("EXCLUDE_SHENGY", "Y");// 排除生育保险
        // map.put("EXCLUDE_GONGS", "Y");// 排除工伤保险
        // map.put("EXCLUDE_SHIY", "Y");// 排除失业保险
        // map.put("EXCLUDE_SEYB", "Y");// 排除少儿医疗保险
        map.put("SUPP_FROM_DATE", "201412");
        inList.add(map);

        List outList = XmlUtil
                .parseXMLToList(invokeMethods(
                        ClqdConstants.SBXXCXJKM_NEW, inList));
        return outList;
     */




}

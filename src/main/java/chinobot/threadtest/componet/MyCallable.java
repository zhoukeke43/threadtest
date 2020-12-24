package chinobot.threadtest.componet;

import chinobot.threadtest.entity.CheckResult;
import chinobot.threadtest.entity.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class MyCallable implements Callable<CheckResult> {

    private Person person;
    private List<CheckResult> checkResultList;
    private CountDownLatch latch;

    public  MyCallable(Person person,List<CheckResult> checkResultList,CountDownLatch latch ){
        this.person=person;
        this.checkResultList=checkResultList;
        this.latch=latch;

    }


    @Override
    public CheckResult call()  {

        List<Map<String, String>> inList = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("ID_NO", person.getIdCard());
        //map.put("S_NO", "103526493");
        //map.put("NAME", person.getName());
        map.put("SUPP_FROM_DATE", "201412");
        inList.add(map);

        CheckResult result=new CheckResult();

        try {
            //List outList = XmlUtil
            //        .parseXMLToList(CheckUtils.invokeMethods(
             //               ClqdConstants.SBXXCXJKM, inList));
            String result0=CheckUtils.invokeMethods(
                                  ClqdConstants.SBXXCXJKM, inList);

            //CheckResult result=new CheckResult();
            //result.setOrigialResult(outList);
            //return result;
            result.setMessage(result0);
        }
        catch (Exception e){
            e.printStackTrace();
            result.setMessage(e.getMessage());
        }
        finally {
            latch.countDown();
        }
        checkResultList.add(result);
        return result;
    }
}

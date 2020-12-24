package chinobot.threadtest.service;

import chinobot.threadtest.componet.CheckUtils;
import chinobot.threadtest.entity.CheckResult;
import chinobot.threadtest.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CheckService {

    public List<CheckResult> check() throws Exception{

        List<Person> personList=new ArrayList<>();
        for(int i=0;i<100;i++){

            personList.add(new Person(i,"362429197809205343","王小敏"));
        }

        return CheckUtils.CheckSB(personList);

    }
}

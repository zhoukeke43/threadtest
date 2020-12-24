package chinobot.threadtest.controller;

import chinobot.threadtest.componet.CheckUtils;
import chinobot.threadtest.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class CheckContrller {

    @Autowired
    private CheckService checkService;

    @RequestMapping("/check")
    @ResponseBody
    public Object check() throws Exception{

        return checkService.check();

    }
}

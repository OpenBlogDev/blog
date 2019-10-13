package bonc.com.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

    @RequestMapping("/index")
    public String findString() {
        return "第一次";
    }

}

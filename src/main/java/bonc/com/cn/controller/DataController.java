package bonc.com.cn.controller;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bonc.com.cn.util.RedisUtil;

@RestController
public class DataController {
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/data")
    public void userInfo(Model model) {
        Map<String, Object> asMap = model.asMap();
        Set<String> keySet = asMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = (String)iterator.next();
            Object value = asMap.get(key);
            System.out.println(key + ">>>>" + value);
        }
    }

    @RequestMapping("/redis")
    public void redisTest() {
        redisUtil.set("bbb", "111");
        System.out.println(redisUtil.get("bbb"));
    }

}

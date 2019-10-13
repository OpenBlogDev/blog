package bonc.com.cn.controller;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

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

}

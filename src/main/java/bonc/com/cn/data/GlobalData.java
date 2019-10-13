package bonc.com.cn.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalData {

    @ModelAttribute(value = "info")
    public Map<String, Object> userInfo() {

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("username", "海贼王");
        map.put("gender", "男");

        return map;
    }

}

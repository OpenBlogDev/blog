package bonc.com.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class BlogEditController {

    @RequestMapping("/blog")
    public void blogEditHandler(MultipartFile[] multipartFiles) {

    }

}

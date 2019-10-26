package bonc.com.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bonc.com.cn.dao.BlogDao;

@RestController
public class BlogEditController {
    /*@RequestMapping("/blog")
    public void blogEditHandler(MultipartFile[] multipartFiles) {}*/
    @Autowired
    private BlogDao blogDao;

    @RequestMapping("/blog")
    public void selectBlog() {
        System.out.println(blogDao.findAll());
    }
}

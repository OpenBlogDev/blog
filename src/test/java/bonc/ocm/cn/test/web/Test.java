package bonc.ocm.cn.test.web;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import bonc.com.cn.App;
import bonc.com.cn.dao.BlogDao;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class Test {

    @Autowired
    private BlogDao blogDao;

    @org.junit.Test
    public void testAddUser() {
        System.out.println(blogDao.findAll());
    }

}

package cn.com.testspringboot;

import cn.com.testspringboot.domain.dao.StudentDao;
import cn.com.testspringboot.domain.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jiaoW on 2017/8/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class TestStudenDao {
    @Autowired
    private StudentDao dao;

    @Test
    public void testProperty(){
        Student test1 = dao.findByName("test1");
        System.out.println(test1);
    }

}

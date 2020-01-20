package com.company.test;

import com.company.dao.UserDAO;
import com.company.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    private ApplicationContext applicationContext;

    @Before
    public void setup() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        // 通过配置资源对象获取 userDAO 对象
        UserDAO userDao = (UserDAO) applicationContext.getBean("userDAO");
        // 调用 UserDAO 的方法
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}

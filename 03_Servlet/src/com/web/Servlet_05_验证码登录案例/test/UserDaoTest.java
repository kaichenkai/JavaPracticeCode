package com.web.Servlet_05_验证码登录案例.test;

import com.web.Servlet_05_验证码登录案例.dao.UserDao;
import com.web.Servlet_05_验证码登录案例.domain.User;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void testLogin() {
        String username = "johny";
        String passwd = "123";
        User user = new UserDao().login(username, passwd);
        System.out.println(user);
    }

}

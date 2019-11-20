package com.web.Servlet_01_UserLogin.test;

import com.web.Servlet_01_UserLogin.dao.UserDao;
import com.web.Servlet_01_UserLogin.domain.User;
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

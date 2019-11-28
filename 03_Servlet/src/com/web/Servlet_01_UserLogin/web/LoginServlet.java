package com.web.Servlet_01_UserLogin.web;

import com.web.Servlet_01_UserLogin.dao.UserDao;
import com.web.Servlet_01_UserLogin.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取用户提交的参数
//        String username = request.getParameter("username");
//        String passwd = request.getParameter("passwd");
//        if (username == null || passwd == null) {
//            // 返回参数错误
//            response.getWriter().write("参数缺失");
//        }
//        com.web.User user = new UserDao().login(username, passwd);

        // 使用 BeanUtils 工具包将参数封装到 javabean 中 (像反序列化)
        // 1. 先获取参数, 放到 Map 集合中
        Map<String, String[]> map = request.getParameterMap();
        // 2. 放入到对应的 javabean 中
        User loginUser = new User();

        try {
            BeanUtils.populate(loginUser, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        User user = new UserDao().login(loginUser.getUsername(), loginUser.getPasswd());

        if ( user != null ) {
            // 登录成功
            request.setAttribute("username", loginUser.getUsername());
            // 转发到登录成功的页面
            request.getRequestDispatcher("/success").forward(request, response);
        } else {
            // 登录失败
            request.getRequestDispatcher("/failed").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

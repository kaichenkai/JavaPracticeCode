package com.web.Servlet_01_UserLogin.web;

import com.web.Servlet_01_UserLogin.dao.UserDao;
import com.web.Servlet_01_UserLogin.domain.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取用户提交的参数
        String username = request.getParameter("username");
        String passwd = request.getParameter("passwd");
        if (username == null || passwd == null) {
            // 返回参数错误
            response.getWriter().write("参数缺失");
        }
        User user = new UserDao().login(username, passwd);

        if ( user != null ) {
            // 登录成功
            request.setAttribute("username", username);
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

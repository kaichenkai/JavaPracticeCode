package com.web.Servlet_01_UserLogin.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录成功
 */
@WebServlet("/success")
public class LoginSuccess extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码
        response.setContentType("text/html; charset=utf-8");
        // 获取 request 域中的共享数据
        Object username = request.getAttribute("username");
        response.getWriter().write("登录成功, 欢迎您, " + username);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

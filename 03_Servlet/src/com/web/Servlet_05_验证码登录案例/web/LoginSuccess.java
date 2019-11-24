package com.web.Servlet_05_验证码登录案例.web;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录成功
 */
@WebServlet("/success2")
public class LoginSuccess extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setCharacterEncoding("utf-8");  // 设置流的编码可以省略
        // 在响应头中设置编码
//        response.setHeader("content-type", "text/html; charset=utf-8");

        // 设置编码 (简单方式)
        response.setContentType("text/html; charset=utf-8");
        // 获取 request 域中的共享数据
        Object username = request.getAttribute("username");
        response.getWriter().write("登录成功, 欢迎您, " + username);

        // 使用字节流对象输出内容
        ServletOutputStream sos = response.getOutputStream();
        sos.write("hello, world".getBytes());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

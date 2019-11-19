package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Request 对象获取请求行数据
 */
@WebServlet("/demo3")
public class Servlet_03_HttpServlet获取请求行消息 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getContextPath());  // 获取虚拟目录
        System.out.println(req.getRequestURI());  // /demo3
        System.out.println(req.getRequestURL());  // http://localhost:8080/demo3
    }
}

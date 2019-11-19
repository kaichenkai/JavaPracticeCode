package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Request 对象获取请求头数据
 */
@WebServlet("/demo4")
public class Servlet_04_HttpServlet拿请求头消息 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // User-Agent
        String userAgent = req.getHeader("User-Agent");
        System.out.println(userAgent);  // Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36
        // Referer
        String referer = req.getHeader("Referer");
        System.out.println(referer);  // null
    }
}

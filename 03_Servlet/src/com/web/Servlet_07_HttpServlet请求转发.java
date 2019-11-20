package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 *   请求转发
 */
@WebServlet("/demo7")
public class Servlet_07_HttpServlet请求转发 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置共享数据
        request.setAttribute("name", "johny");
        // 获取请求转发器, 调用方法转发
        request.getRequestDispatcher("/demo8").forward(request, response);
    }
}

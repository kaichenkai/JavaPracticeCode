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
 *  获取参数的通用方式
 */
@WebServlet("/demo6")
public class Servlet_06_HttpServlet拿请求参数通用方式 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 根据参数名称获取参数值
        System.out.println(request.getParameter("username"));  //
        // 2. 根据参数名称获取参数值的数组
        System.out.println(Arrays.toString(request.getParameterValues("hobby")));  //
        // 3. 获取所有参数的map集合
        Map<String, String[]> map = request.getParameterMap();
        for (String key : map.keySet()) {
            System.out.println("key: " + key);
            String[] values = map.get(key);
            for (String value : values) {
                System.out.println("value: " + value);
            }
            System.out.println(" --- ");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

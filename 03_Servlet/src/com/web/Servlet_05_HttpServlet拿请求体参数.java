package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/demo5")
public class Servlet_05_HttpServlet拿请求体参数 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 读取字符流
        BufferedReader br = request.getReader();
        // 读取一行
        System.out.println(br.readLine());
        // 读取所有
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);  // username=johny&passwd=123123
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

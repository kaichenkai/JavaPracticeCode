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
 *  被转发的 Servlet
 */
@WebServlet("/demo8")
public class Servlet_08_HttpServlet被转发的Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet demo8 doPost execute ...");
        Object name = request.getAttribute("name");
        if (name instanceof String) {
            System.out.println(name);
        }
    }
}

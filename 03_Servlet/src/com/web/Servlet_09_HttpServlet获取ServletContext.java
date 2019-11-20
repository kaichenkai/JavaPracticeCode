package com.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *  获取 ServletContext 对象
 */
@WebServlet("/demo9")
public class Servlet_09_HttpServlet获取ServletContext extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = request.getServletContext();
        System.out.println(sc);  //  org.apache.catalina.core.ApplicationContextFacade@21dfe549
    }
}

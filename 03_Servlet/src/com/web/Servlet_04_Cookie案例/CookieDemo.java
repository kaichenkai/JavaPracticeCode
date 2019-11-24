package com.web.Servlet_04_Cookie案例;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * cookie 访问案例
 */
@WebServlet("/cookie")
public class CookieDemo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 尝试获取浏览器中的     cookie
        Cookie[] cookies = request.getCookies();
        // 设置字符流的编码
        response.setContentType("text/html; charset=utf-8");

        // 考虑有其它的 cookie 但没有 lastTime 这个 cookie
        boolean flag = false;
        //
        if (cookies != null && cookies.length > 0) {

            for (Cookie cookie : cookies) {
                if ("lastTime".equals(cookie.getName())){
                    // 获取 cookie 中上次访问的时间日期
                    String lastTimeStr = cookie.getValue();
                    response.getWriter().write("<h1>您上次登录访问时间: " + lastTimeStr + "</h1>");
                    // 重新设置 cookie
                    this.setCookie(response);
                    // 已经找到 cookie 的值
                    flag = true;
                    break;
                }
            }
        }

        if ( cookies == null || cookies.length < 1 || flag == false) {
            // 第一次访问, 设置 cookie
            this.setCookie(response);
            // 返回欢迎信息
            response.getWriter().write("<h1>您好, 欢迎登陆首页</h1>");
        }
    }

    /**
     * 设置 cookie
     * @param response
     */
    public void setCookie(HttpServletResponse response){
        LocalDateTime ldt = LocalDateTime.now(); // 获取当前日期时间对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        String lastTimeStr = dtf.format(LocalDateTime.now());
        response.addCookie(new Cookie("lastTime", lastTimeStr));
    }
}

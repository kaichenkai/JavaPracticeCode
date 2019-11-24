package com.web.Servlet_05_验证码登录案例.web;

import com.web.Servlet_05_验证码登录案例.dao.UserDao;
import com.web.Servlet_05_验证码登录案例.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/login2")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 先获取参数, 放到 Map 集合中
        Map<String, String[]> map = request.getParameterMap();
        // 拿出 session 中的 imageCode 进行比较
        HttpSession session = request.getSession();
        String imageCode = String.valueOf(session.getAttribute("imageCode"));
        if (imageCode.equalsIgnoreCase(request.getParameter("imageCode"))) {
            // 再判断用户名和密码
            // 使用 BeanUtils 工具包将参数封装到 javabean 中 (像反序列化)
            // 放入到对应的 javabean 中
            User loginUser = new User();
            try {
                BeanUtils.populate(loginUser, map);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            // 校验用户名及密码
            User user = new UserDao().login(loginUser.getUsername(), loginUser.getPasswd());
            if (user != null) {
                // 登录成功, 设置 session, 跳转到首页
                session.setAttribute("username", loginUser.getUsername());
                response.sendRedirect("/index.html");
            } else {
                // 登录失败, 设置编码, 返回用户名或密码错误, 跳转到登录页面
                response.setContentType("text/html; charset=utf-8");
                response.getWriter().write("用户名或密码错误");
//                response.sendRedirect("/login2.html");
            }
        } else {
            // 验证码输入错误, 跳转到登录页面
            response.setContentType("text/html; charset=utf-8");
            response.getWriter().write("验证码输入错误");
//            response.sendRedirect("/login2.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

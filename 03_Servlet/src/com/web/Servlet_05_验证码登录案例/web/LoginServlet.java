package com.web.Servlet_05_验证码登录案例.web;

import com.web.Servlet_05_验证码登录案例.dao.UserDao;
import com.web.Servlet_05_验证码登录案例.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;


/**
 * 用户登录的逻辑
 */
@WebServlet("/login2")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 校验 cookie, 是否登录过
        Cookie[] cookies = request.getCookies();
        // 拿出 session 中的 imageCode 进行比较
        HttpSession session = request.getSession();
        for (Cookie cookie : cookies) {
            String value = cookie.getValue();
            // 如果在 cookie 中有 username 的值, 并且session中存在
            String isLogin = (String) session.getAttribute(value);
            if (isLogin != null) {
                // 登录过, 直接跳转 loginSuccess.jsp
                response.sendRedirect("/loginSuccess.jsp");
            }
        }

        // 登录逻辑
        // 先获取参数, 放到 Map 集合中
        Map<String, String[]> map = request.getParameterMap();
        String imageCode = String.valueOf(session.getAttribute("imageCode"));
        if (imageCode.equalsIgnoreCase(request.getParameter("imageCode"))) {
            // 再判断用户名和密码
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
                // 登录成功, 保存session, 设置 cookie, 跳转到首页
                session.setAttribute(loginUser.getUsername(), loginUser.getPasswd());
                Cookie cookie = new Cookie("username", loginUser.getUsername());
                cookie.setMaxAge(20);
                response.addCookie(cookie);
                response.sendRedirect("/loginSuccess.jsp");
            } else {
                // 登录失败, 设置编码, 返回用户名或密码错误, 跳转到登录页面
                response.setContentType("text/html; charset=utf-8");
                response.getWriter().write("用户名或密码错误");
//                response.sendRedirect("/login2.html");
//                request.getRequestDispatcher("/login2.html").forward(request, response);
            }
        } else {
            // 验证码输入错误, 跳转到登录页面
            response.setContentType("text/html; charset=utf-8");
            response.getWriter().write("验证码输入错误");
//            response.sendRedirect("/login2.html");
//            request.getRequestDispatcher("/login2.html").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

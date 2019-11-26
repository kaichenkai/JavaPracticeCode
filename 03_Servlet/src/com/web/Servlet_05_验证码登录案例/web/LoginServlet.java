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
//        // 校验 cookie, 是否登录过
//        Cookie[] cookies = request.getCookies();
//        // 拿出 session 中的 imageCode 进行比较
//        HttpSession session = request.getSession();
//        for (Cookie cookie : cookies) {
//            String value = cookie.getValue();
//            // 如果在 cookie 中有 username 的值, 并且session中存在
//            String isLogin = (String) session.getAttribute(value);
//            if (isLogin != null) {
//                // 登录过, 直接跳转 loginSuccess.jsp
//                response.sendRedirect("/loginSuccess.jsp");
//            }
//        }

        // 为解除中文参数乱码问题, 设置 request 的字符流编码
        request.setCharacterEncoding("utf-8");
        // 比较验证码
        String imageCode = request.getParameter("imageCode");
        HttpSession session = request.getSession();
        String imageCodeSession = String.valueOf(session.getAttribute("imageCode"));
        // 从 session 中获取图片验证码之后, 立即删除
        session.removeAttribute("imageCode");
        if (imageCodeSession != null && imageCodeSession.equalsIgnoreCase(imageCode)) {
            // 再判断用户名和密码, 将参数封装到对应的 javabean 中
            Map<String, String[]> map = request.getParameterMap();
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
                // 登录失败, 跳转到登录页面, 提示用户名或密码错误
                request.setAttribute("loginFailed", "用户名或密码错误");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        } else {
            // 跳转到登录页面, 提示验证码输入错误
            request.setAttribute("imageCodeError", "验证码输入错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

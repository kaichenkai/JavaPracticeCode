package com.company.controller;

import com.company.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserLogin {
//    @RequestMapping("/param")
//    public ModelAndView getParam(HttpServletRequest request, HttpServletResponse response) {
//        String userName = request.getParameter("username");
//        String passWd= request.getParameter("passwd");
//        // 在页面上展示 用户名和密码
//        ModelAndView mv = new ModelAndView("index");
//        mv.addObject("message", String.format("%s, %s", userName, passWd));
//        return mv;
//    }

    /**
     * 使用 @RequestParam("前台参数名") 来注入
     * @return
     */
//    @RequestMapping("/param")
//    public ModelAndView getParam(@RequestParam("username") String username, String passwd) {
//        // 在页面上展示 用户名和密码
//        ModelAndView mv = new ModelAndView("index");
//        mv.addObject("message", String.format("%s, %s", username, passwd));
//        return mv;
//    }

    /**
     * 使用 User 模型传参
     * @return
     */
    @RequestMapping("/param")
    public ModelAndView getParam(User user) {
        // 在页面上展示 用户名和密码
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("message", String.format("%s, %s", user.getUsername(), user.getPasswd()));
        return mv;
    }
}

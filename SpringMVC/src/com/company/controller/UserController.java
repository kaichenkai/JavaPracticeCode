package com.company.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView("user/userList");
//        ModelAndView mav = new ModelAndView("WEB-INF/views/user/userList.jsp");
        mav.addObject("name", "hello SpringMVC");
        return mav;
    }
}

package com.company.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author: kaichenkai
 * @create: 7/31/2020 16:23
 */

// * 非注解方式
//public class IndexController implements Controller {
//    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.addObject("message", "springmvc");
//        return modelAndView;
//    }
//}

// 注解方式
@org.springframework.stereotype.Controller
public class IndexController {
    @RequestMapping("index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "springmvc");
        return modelAndView;
    }
}
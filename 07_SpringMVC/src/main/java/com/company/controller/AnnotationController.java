package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: kaichenkai
 * @create: 7/31/2020 17:09
 */
@Controller
//@RequestMapping("/root")//这里可以配置根路径
public class AnnotationController {
    @RequestMapping("/annotation")
    public ModelAndView handleRequest(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "来自注解版的控制器返回结果");
        return modelAndView;
    }

    /**
     * 简单的返回 ModelAndView
     * @return /views/index.jsp
     */
    @RequestMapping("/annotation2")
    public String index(){
        return "index";
    }

    /**
     * 指定访问的请求方式
     * @return /views/index.jsp
     */
    @RequestMapping(value = "/annotation3", method = RequestMethod.POST)
    public String index2(){
        return "index";
    }
}

package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: kaichenkai
 * @create: 7/31/2020 17:09
 */
@Controller
public class AnnotationController {
    @RequestMapping("/annotation")
    public ModelAndView handleRequest(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "来自注解版的控制器返回结果");
        return modelAndView;
    }
}

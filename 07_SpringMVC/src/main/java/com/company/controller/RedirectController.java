package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: kaichenkai
 * @create: 8/3/2020 11:13
 */
@Controller
@RequestMapping("redirect")
public class RedirectController {
    @RequestMapping("jump")
    public ModelAndView redirect(){
        //重定向到 index 页面
        return new ModelAndView("redirect:/index");
    }
}

package com.company.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//public class HelloController implements Controller {
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView mv = new ModelAndView("index.jsp");
//        mv.addObject("message", "Hello Spring MVC.,......");
//        return mv;
//    }
//}

/**
 * 使用注解的方式配置路由
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/hello2")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView mv = new ModelAndView("index");
//        mv.addObject("message", "Hello Spring MVC.,......");
        ModelAndView mv = new ModelAndView("test");
        return mv;
    }

    /**
     * 重定向
     * @return
     */
//    @RequestMapping("/jump")
//    public ModelAndView jump() {
//        ModelAndView mv = new ModelAndView("redirect:/hello/hello2");
//        return mv;
//    }

    /**
     * 重定向也可以这样写
     */
    @RequestMapping("/jump")
    public String jump() {
        // 指定子路由
        return "redirect: ./hello2";
    }
}
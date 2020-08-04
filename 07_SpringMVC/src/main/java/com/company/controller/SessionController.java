package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author: kaichenkai
 * @create: 8/3/2020 11:34
 */
@Controller
public class SessionController {
    @RequestMapping("session")
    public ModelAndView httpSession(HttpSession httpSession){
        Integer count = (Integer) httpSession.getAttribute("count");
        if (count == null) {
            count = 1;
        } else {
            count += 1;
        }
        httpSession.setAttribute("count", count);
        //
        return new ModelAndView("showSession");
    }
}

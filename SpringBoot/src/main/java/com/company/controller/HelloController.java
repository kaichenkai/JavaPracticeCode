package com.company.controller;

import com.company.services.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello 控制器
 */
@RestController
public class HelloController {
    @Autowired
    private StudentProperties studentProperties;

    @RequestMapping("/hello")
    public String hello(){
//        return "hello world";
        return "12123123123123";
    }
}

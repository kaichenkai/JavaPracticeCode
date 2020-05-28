package com.company.controller;

import com.company.services.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * hello 控制器
 */
@RestController
public class HelloController {
    @Autowired
    private StudentProperties studentProperties;

    @RequestMapping("/hello")
    public String hello(){
//        List<Integer> list = List.of(1, 2, 5);  // java1.9版本支持

//        return list.toString();
        return "123";
    }
}

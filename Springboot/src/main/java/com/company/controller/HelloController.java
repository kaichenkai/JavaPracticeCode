package com.company.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    static Logger logger = LoggerFactory.getLogger(HelloController.class);


    @Value("${person.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        logger.info("hello world");
        return String.format("Hello World, %s", name);
    }
}

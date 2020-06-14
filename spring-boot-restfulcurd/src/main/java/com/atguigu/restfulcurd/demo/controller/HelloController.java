package com.atguigu.restfulcurd.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
 * @author kaichenkai
 * @date 2020-06-13 17:35
 */

//@RestController
@Controller
@RequestMapping("/main")
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @ResponseBody
    @GetMapping("hello")
    public String hello(){
        logger.info("hello 路由被访问了");
        return "hello world";
    }

    @GetMapping("thymeleaf")
    public String thymeleaf(Map<String, Object> map){
//        Map<String, Object> map = new HashMap<>();
        map.put("test", "test data ...");
        return "/thymeleafTest.html";
    }
}

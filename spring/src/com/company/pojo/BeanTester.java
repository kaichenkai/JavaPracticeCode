package com.company.pojo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanTester {
    @Bean("testBean")
    public String test() {
        String str = "测试@ Bean 注解";
        return str;
    }
}
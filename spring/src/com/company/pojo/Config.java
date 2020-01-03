package com.company.pojo;

import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackageClasses = {com.company.pojo.Student.class, com.company.service.StudentServiceImpl.class})
//@ComponentScan(basePackages = "com.company.pojo")
public class Config {

}

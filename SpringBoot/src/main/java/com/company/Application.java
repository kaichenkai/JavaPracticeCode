package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类, 说明这是一个 Spring Boot应用
 */
@SpringBootApplication
//- @SpringBootConfiguration
//- @EnableAutoConfiguration
//- @ComponentScan
//@MapperScan({"com.company.user.mapper"})//不扫描Mapper也可以运行
public class Application {
    public static void main(String[] args) {
        // Spring 应用启动
//        SpringApplication.run(Application.class, args);
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
    }
}

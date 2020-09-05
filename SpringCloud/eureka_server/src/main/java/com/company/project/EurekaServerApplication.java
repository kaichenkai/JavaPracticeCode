package com.company.project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: kaichenkai
 * @create: 8/19/2020 17:54
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(EurekaServerApplication.class);
//        application.run(args);
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
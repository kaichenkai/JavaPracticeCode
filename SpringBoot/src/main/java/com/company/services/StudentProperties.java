package com.company.services;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: kaichenkai
 * @create: 5/26/2020 16:02
 */

@Component
@ConfigurationProperties(prefix = "student")
public class StudentProperties {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "StudentProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.company.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component // 默认以类名全小写来命名作为 id
public class Student {
    @Value("anson")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

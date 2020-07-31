package com.company.model;

import org.springframework.stereotype.Component;

/**
 * @author: kaichenkai
 * @create: 7/31/2020 11:15
 */
@Component
public class Category {
    private Integer id;
    private String name;

    public Category() {
    }

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
        getter and setter
         */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

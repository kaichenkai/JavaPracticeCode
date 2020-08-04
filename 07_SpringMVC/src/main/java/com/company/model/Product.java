package com.company.model;

/**
 * @author: kaichenkai
 * @create: 8/3/2020 10:43
 */
public class Product {
    private Integer id;
    private String name;
    private float price;

    public Product() {
    }

    public Product(Integer id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

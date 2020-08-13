package com.company.pojo;

import java.util.List;

/**
 * @author: kaichenkai
 * @create: 8/11/2020 15:42
 */
public class Category {
    private int id;
    private String name;
    //与产品的多对一关系
    List<Product> products;

    public Category() {
        super();
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
        getter and setter
         */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}

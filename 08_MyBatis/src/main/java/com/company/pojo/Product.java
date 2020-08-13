package com.company.pojo;

import java.util.List;

/**
 * @author: kaichenkai
 * @create: 8/11/2020 17:15
 */
public class Product {
    private Integer id;
    private String name;
    private float price;
    //
    private Category category;
    //
    private List<OrderItem> orderItems;

    public Product() {
        super();
    }

    public Product(Integer id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /*
        setter and getter
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}

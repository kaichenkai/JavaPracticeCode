package com.company.pojo;

import java.util.List;

/**
 * @author: kaichenkai
 * @create: 8/11/2020 18:06
 */
public class Order {
    private int id;
    private String code;
    //
    private List<OrderItem> orderItems;

    public Order() {
        super();
    }

    public Order(int id, String code) {
        this.id = id;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}

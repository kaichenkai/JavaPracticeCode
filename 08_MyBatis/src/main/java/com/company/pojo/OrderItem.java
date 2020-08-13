package com.company.pojo;

/**
 * @author: kaichenkai
 * @create: 8/11/2020 18:05
 */
public class OrderItem {
    private int id;
    private int number;
    private Order order;
    private Product product;

    public OrderItem() {
        super();
    }

    public OrderItem(int number, Order order, Product product) {
        this.number = number;
        this.order = order;
        this.product = product;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

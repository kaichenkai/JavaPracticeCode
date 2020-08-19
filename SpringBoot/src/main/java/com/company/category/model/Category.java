package com.company.category.model;

/**
 * @author: kaichenkai
 * @create: 7/1/2020 13:58
 */
public class Category {
    private int id;

    private String name;

    public Category() {
    }

    public Category(int id, String name, int age) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

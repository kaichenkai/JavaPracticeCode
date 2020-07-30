package com.company.demo02注解.pojo;

import javax.persistence.*;
import java.util.Set;

/**
 * @author: kaichenkai
 * @create: 7/29/2020 18:00
 */
@Entity
@Table(name = "user")
public class User {
    @Id//表示这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表示自增长方式使用mysql自带的
    @Column(name = "id")//表示映射到字段id
    private Integer id;

    @Column(name = "name")//表示name属性映射表的name字段
    private String name;

    @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinTable(
            name="user_product",
            joinColumns=@JoinColumn(name="uid"),
            inverseJoinColumns=@JoinColumn(name="pid")
    )
    private Set<Product> products;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

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

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}

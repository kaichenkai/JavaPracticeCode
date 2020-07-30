package com.company.demo02注解.pojo;

import javax.persistence.*;
import java.util.Set;


/**
 * @author: kaichenkai
 * @create: 7/29/2020 11:39
 * 注解方式
 */
@Entity//Entity 表示这是一个实体类，用于映射表
@Table(name = "product")//表示这是一个类，映射到的表名:product_
public class Product {
    @Id//表示这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表示自增长方式使用mysql自带的
    @Column(name = "id")//表示映射到字段id
    private Integer id;

    @Column(name = "name")//表示name属性映射表的name字段
    private String name;

    @Column(name = "price")//表示price属性映射表的price字段
    private Float price;

    //分类
    @ManyToOne
    @JoinColumn(name="cid")
    private Category category;

    //用户
    @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinTable(
            name="user_product",
            joinColumns=@JoinColumn(name="pid"),
            inverseJoinColumns=@JoinColumn(name="uid")
    )
    private Set<User> users;

    public Product(Integer id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}

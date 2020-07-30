package com.company.demo02注解.pojo;

import javax.persistence.*;
import java.util.Set;

/**
 * @author: kaichenkai
 * @create: 7/29/2020 17:03
 */

@Entity
@Table(name = "category")
public class Category {
    @Id//表示这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表示自增长方式使用mysql自带的
    @Column(name = "id")//表示映射到字段id
    private Integer id;

    @Column(name = "name")//表示name属性映射表的name字段
    private String name;

    @OneToMany(fetch=FetchType.LAZY)//fetch=FetchType.EAGER 表示不进行延迟加载(FetchType.LAZY表示要进行延迟加载)
    @JoinColumn(name="cid")
    private Set<Product> productList;

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category() {
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productList=" + productList +
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

    public Set<Product> getProductList() {
        return productList;
    }

    public void setProductList(Set<Product> productList) {
        this.productList = productList;
    }
}

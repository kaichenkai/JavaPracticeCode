package com.company.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: kaichenkai
 * @create: 7/31/2020 11:41
 */
@Component
public class Product {
    private Integer id;
    private String name;
    private Float price;
    //分类
//根据 bean name 的值 == 属性名 进行注入
    //    @Autowired
//    除了@Autowired之外，@Resource也是常用的手段
    @Resource
    private Category category;

    public Product() {
    }

    public Product(Integer id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }
    //除了前面的 在属性前加上@Autowired 这种方式外，也可以在setCategory方法前加上@Autowired，这样来达到相同的效果
    //@Autowired
    public void setCategory(Category category) {
        this.category = category;
    }
}

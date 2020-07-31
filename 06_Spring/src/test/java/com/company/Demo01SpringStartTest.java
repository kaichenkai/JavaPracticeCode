package com.company;

import com.company.model.Category;
import com.company.model.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: kaichenkai
 * @create: 7/31/2020 11:23
 */
public class Demo01SpringStartTest {
    @Test
    public void testSpringStart(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"applicationContext.xml"}
        );
        //
        Category category = (Category) context.getBean("category");
        System.out.println(category.getName());
        //
        Product macbook = (Product) context.getBean("product");
        System.out.println(macbook);
    }
}

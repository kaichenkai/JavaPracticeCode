package com.company;

import com.company.model.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: kaichenkai
 * @create: 7/31/2020 11:58
 */
public class Demo02DITest {
    @Test
    public void testDI(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        //
        Product product = (Product) context.getBean("product");
        System.out.println(product.getName());//macbook
        System.out.println(product.getCategory().getName());//category1
    }
}

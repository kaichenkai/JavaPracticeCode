package com.company.test;

import com.company.service.ProductService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProductService {
    @Test
    public void testDoSomeService(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );

        ProductService ps = (ProductService) context.getBean("productService");
        ps.doSomeService();
    }
}

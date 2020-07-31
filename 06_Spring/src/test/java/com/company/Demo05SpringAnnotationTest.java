package com.company;

import com.company.model.Category;
import com.company.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: kaichenkai
 * @create: 7/31/2020 15:08
 * 测试中使用注解
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo05SpringAnnotationTest {
    @Autowired
    private ProductService productService;

    @Test
    public void testAnnotation(){
        productService.doSomeService();
    }
}

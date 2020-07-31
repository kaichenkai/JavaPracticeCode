package com.company;

import com.company.service.ProductService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: kaichenkai
 * @create: 7/31/2020 14:26
 */
public class Demo04ServiceBeanTest {
    /**
     * 根据xml配置文件获取
     */
    @Test
    public void testServiceBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        //
        ProductService productService = (ProductService) context.getBean("productService");
        productService.doSomeService();
    }

    /**
     * 根据注解获取
     */
    @Test
    public void testServiceBeanAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        //
        ProductService productService = context.getBean(ProductService.class);
        productService.doSomeService();
    }
}

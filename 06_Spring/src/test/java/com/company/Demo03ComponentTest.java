package com.company;

import com.company.model.Category;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: kaichenkai
 * @create: 7/31/2020 14:07
 */
public class Demo03ComponentTest {
    @Test
    public void testComponent(){
        ApplicationContext context =  new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        //
        Category category = context.getBean(Category.class);
        category.setName("apple");
        System.out.println(category);
    }
}

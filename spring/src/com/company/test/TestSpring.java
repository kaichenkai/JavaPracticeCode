package com.company.test;

import com.company.pojo.JuiceMaker;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.company.pojo.Source;


import org.junit.Test;

public class TestSpring {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );

        // 反转控制
        Source source = (Source) context.getBean("source");  // 强转类型
        System.out.println(source.getFruit());
        System.out.println(source.getSugar());
        System.out.println(source.getSize());

        // 依赖注入
        JuiceMaker jm = (JuiceMaker) context.getBean("juickMaker");
        jm.makeJuice();
    }
}

package com.company.test;

import javafx.application.Application;
import org.junit.Test;
import com.company.pojo.JuiceMaker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.company.pojo.Source;
import com.company.pojo.Config;
import com.company.pojo.Student;
import com.company.service.ProductService;
import com.company.service.StudentServiceImpl;


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

    @Test
    public void testDoSomeService(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );

        ProductService ps = (ProductService) context.getBean("productService");
        ps.doSomeService();
    }

    @Test
    public void testBeanXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("testBean.xml");
        Student s1 = (Student) context.getBean("student", Student.class);
        // 根据 id 获取 Bean
        Student s2 = (Student) context.getBean("s1");
        System.out.println(s1.getName());
        System.out.println(s2.getName());

//        Source source = (Source) context.getBean("source", Source.class);
//        System.out.println(source.getFruit());
//        System.out.println(source.getSugar());
//        System.out.println(source.getSize());
    }

    /**
     * 使用 @Component 注解的方式装配 Bean
     */
    @Test
    public void testComponent(){
        ApplicationContext ct = new AnnotationConfigApplicationContext(Config.class);
        Student s2 = (Student) ct.getBean("student", Student.class);
        System.out.println(s2.getName());  // anson

        // 注入 Student 对象
        StudentServiceImpl s3 = (StudentServiceImpl) ct.getBean("studentService", StudentServiceImpl.class);
        s3.printStudentInfo();  // 学生的姓名是: anson
    }

    /**
     * 使用 @Bean 注解的方式
     */
    @Test
    public void testBean(){
        ApplicationContext ct = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(ct.getBean("testBean"));
    }
}
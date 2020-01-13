package com.company.test;

import com.company.mapper.StudentMapper;
import com.company.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestStudentMapper {
    /**
     * 测试动态代理 Mapper
     */
    @Test
    public void testStudentMapper() throws Exception {
        // 获取 配置信息, 得到 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 根据 sqlSessionFactory 得到 sqlSession
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        //
        // 获取 Mapper 代理
        StudentMapper sm = sqlSession1.getMapper(StudentMapper.class);
        StudentMapper sm2 = sqlSession2.getMapper(StudentMapper.class);
        // 执行 Mapper 代理独享的查询方法
        Student student3 = sm.findSudentById(3);
        Student student4 = sm2.findSudentById(3);
        System.out.println(student3);  // Student{id=3, student_id=3, card_id=2, name='anson'}
        System.out.println(student4);  // Student{id=3, student_id=3, card_id=2, name='anson'}
        // 回收资源
//        sqlSession1.close();
//        sqlSession2.close();
    }
}

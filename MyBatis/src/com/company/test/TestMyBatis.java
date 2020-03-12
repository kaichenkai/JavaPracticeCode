package com.company.test;

import com.company.pojo.Student;
import com.company.pojo.StudentAndCard;
import com.company.pojo.StudentWithCard;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.io.Serializable;


public class TestMyBatis {

    @Test
    /**
     * 获取学生列表
     */
    public void testStudent() throws IOException {
        // 获取 配置信息, 得到 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 根据 sqlSessionFactory 得到 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 通过 sqlSession 的 selectList() 方法调用 sql 语句, 得到 listStudent
        List<Student> listStudent = sqlSession.selectList("listStudent");
        // 遍历结果
        for (Student student : listStudent) {
//            System.out.println(student.getId());
//            System.out.println(student.getName());
            System.out.println(student.toString());
        }
    }

    /**
     * CRUD
     */
    @Test
    public void testCRUD() throws Exception {
        // 获取 配置信息, 得到 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 根据 sqlSessionFactory 得到 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 增加一个
        Student student1 = new Student();
        student1.setId(0);
        student1.setStudent_id(4);
        student1.setName("johny");
        sqlSession.insert("addStudent", student1);

        // 删除一个
        Student student2 = new Student();
        student2.setId(2);
        sqlSession.delete("deleteStudent", student2);

        // 更新一个
        Student student3 = new Student();
        student3.setId(3);
        student3.setName("anson");
        sqlSession.update("updateStudent", student3);

        // 查询 id 为3 的学生
        Student s = sqlSession.selectOne("getStudent", student3);
        System.out.println(s.toString());

        // 提交修改, 关闭session
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * StudentAndCard 连接查询
     * @throws IOException
     */
    @Test
    public void testFindStudentByCardNumber() throws IOException {
        // 获取 配置信息, 得到 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 根据 sqlSessionFactory 得到 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        //
//        StudentAndCard sac = sqlSession.selectOne("findStudentByCardNumber", 2222);
        StudentWithCard swc = sqlSession.selectOne("findStudentByCard", 2222);
        System.out.println(swc);
        sqlSession.commit();
        sqlSession.close();

        //
//        StudentWithCard swc2 = sqlSession2.selectOne("findStudentByCard", 2222);
//        System.out.println(swc2);
//        sqlSession2.commit();
//        sqlSession2.close();
//        System.out.println(swc.getStudent().getName());
    }
}

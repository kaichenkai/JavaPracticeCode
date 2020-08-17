import com.company.pojo.Category;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: kaichenkai
 * @create: 8/12/2020 17:35
 */
public class Demo14FirstCacheTest {
    /**
     * 在session1中查询两次id=1的Category对象。
     * 第一次会去数据库中取数据，但是第二次就不会访问数据库了，而是直接从session中取出来
     * @throws IOException
     */
    @Test
    public void testFirstCache() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session1 = sqlSessionFactory.openSession();
        //
        Category category1 = session1.selectOne("getCategory", 1);
        System.out.println(category1);
        Category category2 = session1.selectOne("getCategory", 1);
        System.out.println(category2);
        //
        session1.commit();
        session1.close();
    }

    /**
     * 另外打开一个session,取同样id的数据，就会发现需要执行sql语句，证实了一级缓存是在session里的
     * @throws IOException
     */
    @Test
    public void testFirstCache2() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session1 = sqlSessionFactory.openSession();
        SqlSession session2 = sqlSessionFactory.openSession();
        //
        Category category1 = session1.selectOne("getCategory", 1);
        System.out.println(category1);

        Category category2 = session2.selectOne("getCategory", 1);
        System.out.println(category2);
        //
        session1.commit();
        session1.close();
        session2.commit();
        session2.close();
    }
}

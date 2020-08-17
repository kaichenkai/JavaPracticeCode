import com.company.pojo.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: kaichenkai
 * @create: 8/12/2020 17:35
 */
public class Demo15SecondCacheTest {
    /**
     * 二级缓存, 在 session 进行 commit 或者 close 操作时, 才会缓存数据(另一个session在查询数据时会读取缓存数据, 否则不会)
     * 在测试代码的时候遇到了这个问题,   一般业务上不会遇到
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
        session1.commit();
        session1.close();

        Category category2 = session2.selectOne("getCategory", 1);
        System.out.println(category2);
        //
//        session1.commit();
//        session1.close();
        session2.commit();
        session2.close();
    }
}

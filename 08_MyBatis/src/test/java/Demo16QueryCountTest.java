import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: kaichenkai
 * @create: 8/17/2020 14:17
 */

public class Demo16QueryCountTest {
    /**
     * 查询分类总数
     */
    @Test
    public void testQueryCount() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //
        Integer count = session.selectOne("countCategory");
        System.out.println("分类记录条数: " + count);
        //
        session.commit();
        session.close();
    }
}

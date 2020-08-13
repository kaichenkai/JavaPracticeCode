import com.company.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author: kaichenkai
 * @create: 8/12/2020 10:51
 * 模糊查询加 if 判断
 */
public class Demo12ForeachConditionTest {
    @Test
    public void testForeachCondition() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //listProductForeach
        Integer[] ids = new Integer[] {1, 2, 3};
        List<Product> productList = session.selectList("listProductForeach", Arrays.asList(ids));
        for (Product product : productList) {
            System.out.println(product.toString());
        }
        //
        session.commit();
        session.close();
    }
}

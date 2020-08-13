import com.company.pojo.Product;
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
 * @create: 8/12/2020 10:51
 * 模糊查询加 if 判断
 */
public class Demo08IfConditionTest {
    @Test
    public void testIfCondition() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //
        Map<String, Object> params = new HashMap<String, Object>();
//        params.put("name", "c");
        List<Product> productList = session.selectList("listProductByName", params);
        for (Product product : productList) {
            System.out.println(product.getName());
            System.out.println(product);
        }
        //
        session.commit();
        session.close();
    }
}

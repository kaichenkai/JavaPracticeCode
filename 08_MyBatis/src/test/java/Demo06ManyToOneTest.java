import com.company.pojo.Category;
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
 * @create: 8/11/2020 17:20
 */
public class Demo06ManyToOneTest {
    @Test
    public void testManyToOne() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //
        List<Product> productList = session.selectList("listProductContainCategory");
        for (Product product : productList) {
            System.out.println(product.toString());
        }
        //关闭sql会话
        session.close();
    }

    @Test
    public void setCategory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pid", 5);
        params.put("cid", 1);
        session.update("updateProductOfCategory", params);
        //
        session.commit();//需要手动提交事务
        session.close();
    }
}

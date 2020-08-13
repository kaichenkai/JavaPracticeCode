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
public class Demo11ChooseConditionTest {
    @Test
    public void testChooseCondition() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //listProductChoose
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", "c");
//        params.put("price", 88);
        List<Product> productList = session.selectList("listProductChoose", params);
        for (Product product : productList) {
            System.out.println(product.toString());
        }
        //
        session.commit();
        session.close();
    }
}

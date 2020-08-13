import com.company.pojo.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: kaichenkai
 * @create: 8/11/2020 15:53
 */

public class Demo01TestMyBatis {
    @Test
    public void testMybatis() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //
        SqlSession session = sqlSessionFactory.openSession();
        List<Category> categoryList = session.selectList("listCategory");
        for (Category category : categoryList) {
            System.out.println(category.getName());
        }
        session.close();
    }
}

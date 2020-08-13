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
 * @create: 8/11/2020 17:20
 */
public class Demo05OneToManyTest {
    @Test
    public void testOneToMany() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //
        List<Category> categoryList = session.selectList("listCategoryContainProduct");
        for (Category category : categoryList) {
            System.out.println(category.toString());
        }
        //关闭sql会话
        session.close();
    }
}

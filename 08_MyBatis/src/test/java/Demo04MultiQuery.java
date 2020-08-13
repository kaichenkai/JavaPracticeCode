import com.company.pojo.Category;
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
 * @create: 8/11/2020 17:07
 * 多条件查询
 */
public class Demo04MultiQuery {
    @Test
    public void testMultiQuery() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        // 组织多条件map
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", 3);
        params.put("name", "1");
        List<Category> categoryList = session.selectList("listCategoryByIdAndName", params);
        for (Category category : categoryList) {
            System.out.println(category.getName());
        }
        //
        session.close();
    }
}

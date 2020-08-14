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
public class Demo13PaginateTest {
    /**
     * 插入100条分类记录
     * @throws IOException
     */
    @Test
    public void addCategory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //
        for (int i=0; i<100; i++) {
            Category category = new Category();
            category.setName("category name" + i);
            session.insert("addCategory", category);
        }
        session.commit();
        session.close();
    }

    @Test
    public void testPaginate() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //listCategoryPaginate
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("offset", 10);//offset
        params.put("count", 20);//count
        List<Category> categoryList = session.selectList("listCategoryPaginate", params);
        for (Category category : categoryList) {
            System.out.println(category.toString());
        }
        //
        session.commit();
        session.close();
    }

    /**
     * 使用 PageHelper 进行分页查询
     * @throws IOException
     */
    @Test
    public void testPagenateByPagehelper() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //listCategoryPaginate
        //设置分页
        PageHelper.offsetPage(10, 20);
        List<Category> categoryList = session.selectList("listCategoryPageHelper");
        for (Category category : categoryList) {
            System.out.println(category.toString());
        }
    }
}

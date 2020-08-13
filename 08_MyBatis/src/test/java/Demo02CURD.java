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
 * @create: 8/11/2020 16:41
 */
public class Demo02CURD {
    @Test
    public void testCURD() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        //add
        Category category = new Category(0, "iphone");
        session.insert("addCategory", category);
        //session.commit();// 会自动提交事务

        //get
//        Category tempCategory = session.selectOne("getCategory", 4);
//        System.out.println(tempCategory.getName());

        //update
//        Category category = new Category(2, "update category2");
//        session.update("updateCategory", category);
        //session.commit();// 会自动提交事务

        //delete
//        session.delete("deleteCategory", category);
        //session.commit();// 会自动提交事务

        session.close();
    }
}

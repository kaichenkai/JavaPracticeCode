package demo01;

import com.company.demo01.pojo.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @author: kaichenkai
 * @create: 7/30/2020 10:12
 * hibernate默认是开启一级缓存的，一级缓存存放在session上
 */
public class Demo06FirstLevelCacheTest {
    @Test
    public void testFirstLevelCache(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session1 = factory.openSession();
        Transaction transaction1 = session1.getTransaction();
        transaction1.begin();
        //多次查询同样的对象, 只会执行一次sql
        System.out.println("log1");
        Category category1 = session1.get(Category.class, 1);
        System.out.println(category1.getId());
        System.out.println("log2");
        Category category2 = session1.get(Category.class, 1);
        System.out.println(category2.getName());
        transaction1.commit();
        session1.close();
        factory.close();
    }
}

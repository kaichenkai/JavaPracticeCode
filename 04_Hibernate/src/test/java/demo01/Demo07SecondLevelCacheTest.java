package demo01;

import com.company.demo01.pojo.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @author: kaichenkai
 * @create: 7/30/2020 10:17
 * 1. Hibernate的一级缓存是在Session上，二级缓存是在SessionFactory上
 * 2. OpenSession每次都会得到一个新的Session对象
 */
public class Demo07SecondLevelCacheTest {
    @Test
    public void testTwoLevelCache(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session1 = factory.openSession();
        Transaction transaction1 = session1.getTransaction();
        transaction1.begin();
        //
        Category category1 = session1.get(Category.class, 1);
        System.out.println(category1.getId());
        transaction1.commit();
        //
        Session session2 = factory.openSession();
        Transaction transaction2 = session2.getTransaction();
        transaction2.begin();
        Category category2 = session2.get(Category.class, 1);
        System.out.println(category2.getName());
        transaction2.commit();
        //
        session1.close();
        session2.close();
        factory.close();
    }
}

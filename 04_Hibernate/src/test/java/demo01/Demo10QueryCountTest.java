package demo01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Test;

/**
 * @author: kaichenkai
 * @create: 7/30/2020 11:50
 * 查询总数
 */
public class Demo10QueryCountTest {
    @Test
    public void testQueryCount(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //
        // from后面接的应该是类名(Product)，而不是表名(product_)。
        Query queryObj = session.createSQLQuery(String.format("SELECT COUNT(*) FROM product_ p where p.name like '%%%s%%'", "macbook"));
//        Query queryObj = session.createQuery("SELECT COUNT(*) FROM Product p where p.name like ?");
//        queryObj.setString(0, "%macbook%");
        long total= Long.parseLong(queryObj.uniqueResult().toString()); //查询总数
        System.out.println("查询总数: " + total);
        //
        transaction.commit();
        session.close();
        factory.close();
    }
}

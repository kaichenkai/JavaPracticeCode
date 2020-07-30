package demo01;

import com.company.demo01.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

/**
 * @author: kaichenkai
 * @create: 7/30/2020 14:59
 * c3p0连接池测试
 */
public class Demo12C3P0Test {
    @Test
    public void testC3P0(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //
        Query query = session.createSQLQuery("select * from product_");
        List<Object[]> productList = query.list();
        for (Object[] objects: productList) {
            for (Object filed : objects) {
                System.out.println(filed);
            }
        }
        //
        transaction.commit();
        session.close();
        factory.close();
    }
}

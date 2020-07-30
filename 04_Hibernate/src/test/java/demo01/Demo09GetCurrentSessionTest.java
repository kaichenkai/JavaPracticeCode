package demo01;

import com.company.demo01.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;


/**
 * @author: kaichenkai
 * @create: 7/30/2020 11:33
 * 1.OpenSession每次都会得到一个新的Session对象
 * 2.相同线程的getCurrentSession, 如果是同一个线程，每次获取的都是相同的Session
 *   2.1 需要注意的是,transaction.commit();//提交之后session会被回收, 再次调用getCurrentSession()获取的是新的session对象
 * 3. openSession查询时候不需要事务, getCurrentSession所有操作都必须放在事务中(否则会导致异常产生)
 */
public class Demo09GetCurrentSessionTest {
    @Test
    public void testGetCurrentSession(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //
        Product product = session.get(Product.class, 3);
        System.out.println(product.getName());
        //transaction.commit();//提交之后session会被回收

        //重新获取当前线程的 session
        Session session2 = factory.getCurrentSession();
        System.out.println("两次获取的session是同一个session对象? " + (session==session2));
        //
        transaction.commit();
        session.close();
        session2.close();
        factory.close();
    }
}

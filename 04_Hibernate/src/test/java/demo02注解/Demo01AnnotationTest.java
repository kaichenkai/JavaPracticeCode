package demo02注解;

import com.company.demo02注解.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;


/**
 * @author: kaichenkai
 * @create: 7/30/2020 14:59
 * 注解版测试
 */
public class Demo01AnnotationTest {
    @Test
    public void testAnnotation(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //增加产品
        for (int i=0; i<=10; i++) {
            Product product = new Product(1, "iphone" + i, (float) (i * 1000));
            session.save(product);
        }
        //
        transaction.commit();
        session.close();
        factory.close();
    }
}

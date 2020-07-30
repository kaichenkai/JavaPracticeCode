package demo01;

import com.company.demo01.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import javax.persistence.OptimisticLockException;

/**
 * @author: kaichenkai
 * @create: 7/30/2020 14:20
 * 乐观锁代码测试
 */
public class Demo11OptimisticLockTest {
    @Test
    public void testOptimisticLock(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session1 = factory.openSession();
        Transaction transaction1 = session1.getTransaction();
        transaction1.begin();
        Session session2 = factory.openSession();
        Transaction transaction2 = session2.getTransaction();
        transaction2.begin();
        //同时修改商品的价格
        Product product1 = session1.get(Product.class, 3);
        Product product2 = session2.get(Product.class, 3);
        product1.setPrice(product1.getPrice() + 1000);
        product2.setPrice(product2.getPrice() + 1000);
        //
        session1.update(product1);
        transaction1.commit();

        //制造乐观锁异常, 重复更新
        try {
            session2.update(product2);
            transaction2.commit();
        } catch (OptimisticLockException ex) {
//            ex.printStackTrace();
            //
            transaction2.begin();
            product2 = session2.get(Product.class, 3);
            product2.setPrice(product2.getPrice() + 1000);
            session2.update(product2);
            transaction2.commit();
        }

        //
        Product product = session2.get(Product.class, 3);
        System.out.println("经过两次价格增加后，价格变为: " + product.getPrice());
        //
        session1.close();
        session2.close();
        factory.close();
    }
}

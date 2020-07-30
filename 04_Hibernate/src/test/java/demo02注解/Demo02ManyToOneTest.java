package demo02注解;

import com.company.demo02注解.pojo.Category;
import com.company.demo02注解.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;


/**
 * @author: kaichenkai
 * @create: 7/30/2020 14:59
 * 多对一
 */
public class Demo02ManyToOneTest {
    /**
     * 增加分类记录
     */
    @Test
    public void testAnnotation(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //增加分类
        Category category = new Category(1, "apple");
        session.save(category);
        //
        transaction.commit();
        session.close();
        factory.close();
    }

    /**
     * 多对一 设置, 查询
     */
    @Test
    public void testManyToOne(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        // 设置
        Product product1 = session.get(Product.class, 1);
        Product product2 = session.get(Product.class, 2);
        Product product3 = session.get(Product.class, 3);

        Category category = session.get(Category.class,1);
        product1.setCategory(category);
        product2.setCategory(category);
        product3.setCategory(category);
        session.save(product1);
        session.save(product2);
        session.save(product3);
        //查询
        System.out.println(product1.getCategory().getName());
        //
        transaction.commit();
        session.close();
        factory.close();
    }
}

package demo02注解;

import com.company.demo02注解.pojo.Category;
import com.company.demo02注解.pojo.Product;
import com.company.demo02注解.pojo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: kaichenkai
 * @create: 7/30/2020 14:59
 */
public class Demo04ManyToManyTest {
    /**
     * 增加用户
     */
    @Test
    public void testAddUser(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //
        for (int i=1; i<=10; i++) {
            User user = new User(i, "user" + i);
            session.save(user);
        }
        //
        transaction.commit();
        session.close();
        factory.close();
    }

    /**
     * 多对多 查询
     */
    @Test
    public void testManyToManySet(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //设置用户1购买产品 1, 2,  用户2购买产品 2,3
        User user1 = session.get(User.class, 1);
        User user2 = session.get(User.class, 2);
        Product product1 = session.get(Product.class, 1);
        Product product2 = session.get(Product.class, 2);
        Product product3 = session.get(Product.class, 3);
        //
        Set<Product> products1 = new HashSet<Product>();
        products1.add(product1);
        products1.add(product2);
        //
        Set<Product> products2 = new HashSet<Product>();
        products2.add(product2);
        products2.add(product3);
        //
        user1.setProducts(products1);
        session.update(user1);
        user2.setProducts(products2);
        session.update(user2);
        //
        transaction.commit();
        session.close();
        factory.close();
    }

    /**
     * 查询用户1购买的产品,  查询产品 2 被哪些用户所购买
     */
    @Test
    public void testManyToManyQuery() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //
        User user1 = session.get(User.class, 1);
        Set<Product> products = user1.getProducts();
        for (Product product : products) {
            System.out.println(product.getName());
        }
        //
        Product product2 = session.get(Product.class, 2);
        Set<User> users = product2.getUsers();
        for (User user : users) {
            System.out.println(user.getName());
        }
        //
        transaction.commit();
        session.close();
        factory.close();
    }
}

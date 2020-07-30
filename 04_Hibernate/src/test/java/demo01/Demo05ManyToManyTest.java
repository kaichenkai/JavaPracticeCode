package demo01;

import com.company.demo01.pojo.Category;
import com.company.demo01.pojo.Product;
import com.company.demo01.pojo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: kaichenkai
 * @create: 7/29/2020 18:01
 */
public class Demo05ManyToManyTest {
    @Test
    public void testManyToMany(){
        //1.获取SessionFactory
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        //2.通过SessionFactory 获取一个Session
        Session session = factory.openSession();
        //3.在Session基础上开启一个事务
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //增加三个用户
        User user1 = new User(1, "johny");
        User user2 = new User(2, "anson");
        User user3 = new User(3, "jerry");
        session.save(user1);
        session.save(user2);
        session.save(user3);

        //查询产品
        Product product1 = session.get(Product.class, 1);
        Product product3 = session.get(Product.class, 3);

        //产品1被用户1购买, 产品3被用户1,2,3购买
        Set<Product> productSet1 = new HashSet<Product>();
        productSet1.add(product1);
        user1.setProducts(productSet1);
        //
        Set<User> users = new HashSet<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        product3.setUsers(users);

        //提交事务
        transaction.commit();
        //关闭Session
        session.close();
        //关闭SessionFactory
        factory.close();
    }
}

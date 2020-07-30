package demo01;

import com.company.demo01.pojo.Category;
import com.company.demo01.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * @author: kaichenkai
 * @create: 7/29/2020 17:30
 */
public class Demo04OneToManyTest {
    @Test
    public void testOneToMany(){
        //1.获取SessionFactory
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        //2.通过SessionFactory 获取一个Session
        Session session = factory.openSession();
        //3.在Session基础上开启一个事务
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //
        Category category = session.get(Category.class, 1);
        Set<Product> productList = category.getProductList();
        for (Product product : productList) {
            System.out.println(product.getName());
        }
        //提交事务
        transaction.commit();
        //关闭Session
        session.close();
        //关闭SessionFactory
        factory.close();
    }
}

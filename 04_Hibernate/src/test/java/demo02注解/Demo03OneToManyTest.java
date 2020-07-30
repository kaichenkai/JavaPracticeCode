package demo02注解;

import com.company.demo02注解.pojo.Category;
import com.company.demo02注解.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Set;

/**
 * @author: kaichenkai
 * @create: 7/30/2020 14:59
 */
public class Demo03OneToManyTest {
    /**
     * 一对多 查询
     */
    @Test
    public void testOneToMany(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //
        Category category = session.get(Category.class,1);
        Set<Product> productList = category.getProductList();
        for (Product product : productList) {
            System.out.println(product.getName());
        }
        //
        transaction.commit();
        session.close();
        factory.close();
    }
}

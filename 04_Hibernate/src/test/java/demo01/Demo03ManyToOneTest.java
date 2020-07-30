package demo01;

import com.company.demo01.pojo.Category;
import com.company.demo01.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @author: kaichenkai
 * @create: 7/29/2020 17:11
 */
public class Demo03ManyToOneTest {
    @Test
    public void testManyToOne(){
        //1.获取SessionFactory
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        //2.通过SessionFactory 获取一个Session
        Session session = factory.openSession();
        //3.在Session基础上开启一个事务
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //
        Category category = new Category(0, "apple");
        session.save(category);//新增分类
        //
        Product product = session.get(Product.class, 3);
        product.setCategory(category);
        session.update(product);//更新产品的分类

        //提交事务
        transaction.commit();
        //关闭Session
        session.close();
        //关闭SessionFactory
        factory.close();
    }
}

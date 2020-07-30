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
 * @create: 7/29/2020 11:54
 */
public class Demo02HibernateSqlTest {
    /**
     * 保存一个产品
     */
    @Test
    public void queryProductByName() {
        //1.获取SessionFactory
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        //2.通过SessionFactory 获取一个Session
        Session session = factory.openSession();
        //3.在Session基础上开启一个事务
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //
        String tempName = "mac";
        String sql = String.format("select * from product_ p where p.name like '%%%s%%'", tempName);
        Query query = session.createSQLQuery(sql);
        List<Object[]> productList = query.list();
        for (Object[] objects: productList) {
            for (Object filed : objects) {
                System.out.println(filed.toString());
            }
        }
        //提交事务
        transaction.commit();
        //关闭Session
        session.close();
        //关闭SessionFactory
        factory.close();
    }
}

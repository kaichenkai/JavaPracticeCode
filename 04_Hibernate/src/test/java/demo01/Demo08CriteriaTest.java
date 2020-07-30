package demo01;

import com.company.demo01.pojo.Product;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import java.util.List;

/**
 * @author: kaichenkai
 * @create: 7/30/2020 11:00
 */
public class Demo08CriteriaTest {
    @Test
    public void testCriteria(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //
//        Criteria criteria = (Criteria) session.createStoredProcedureCall("product", Product.class);
        Criteria criteria = session.createCriteria( Product.class);
        //增加查询条件
        criteria.add(Restrictions.like("name", "%macbook%"));
        criteria.setFirstResult(2);//从第3条记录开始
        criteria.setMaxResults(5);//取出5条数据
        //查询
        List<Product> productList = criteria.list();
        for (Product product : productList) {
            System.out.println(product.getName());
        }
        //
        transaction.commit();
        session.close();
        factory.close();
    }
}

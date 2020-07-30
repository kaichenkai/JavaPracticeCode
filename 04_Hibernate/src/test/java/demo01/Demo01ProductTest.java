package demo01;

import com.company.demo01.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @author: kaichenkai
 * @create: 7/29/2020 11:54
 */
public class Demo01ProductTest {
    /**
     * 保存一个产品
     */
    @Test
    public void testProductSave(){
        //1.获取SessionFactory
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        //2.通过SessionFactory 获取一个Session
        Session session = factory.openSession();
        //3.在Session基础上开启一个事务
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //4.通过调用Session的save方法把对象保存到数据库
//        Product macbook = new Product(0, "macbook2020", 9200F);
//        session.save(macbook);
        for (int i=0; i<10; i++) {
            Product product = new Product(0, "macbook" + i, (float) (i * 1000));
            session.save(product);
        }
//        int a = 1 / 0;
        //5.提交事务
//        transaction.commit();//不提交也能保存到数据库
        //6.关闭Session
        session.close();
        //7.关闭SessionFactory
        factory.close();
    }

    /**
     * 查询一个产品
     */
    @Test
    public void testGetProductById(){
        //1.获取SessionFactory
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        //2.通过SessionFactory 获取一个Session
        Session session = factory.openSession();
        //3.在Session基础上开启一个事务
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //4.通过 id 获取产品obj
        //get 获取
//        Product product = session.get(Product.class, 2);

        //load 获取
        //使用hibernate中的延迟加载(lazyload)分属性的延迟加载和关系的延迟加载
        //属性的延迟加载:
        //当使用load的方式来获取对象的时候，只有访问了这个对象的属性，hibernate才会到数据库中进行查询。否则不会访问数据库
        Product product = session.load(Product.class, 3);
        System.out.println("获取属性之前");
        System.out.println("product: " + product.getName());//product: Product{id=2, name='macbook2020', price=9200.0}
        //5.提交事务
        //transaction.commit();
        //6.关闭Session
        session.close();
        //7.关闭SessionFactory
        factory.close();
    }

    /**
     * 删除一个产品
     */
    @Test
    public void testDeleteProductById(){
        //1.获取SessionFactory
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        //2.通过SessionFactory 获取一个Session
        Session session = factory.openSession();
        //3.在Session基础上开启一个事务
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //4.通过 id 获取产品obj
        Product product = session.get(Product.class, 2);
        //删除产品
        session.delete(product);
        //提交事务
//        transaction.commit();//不提交不能删除
        //关闭Session
        session.close();
        //关闭SessionFactory
        factory.close();
    }

    /**
     * 更新一个产品
     */
    @Test
    public void testUpdateProduct(){
        //1.获取SessionFactory
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        //2.通过SessionFactory 获取一个Session
        Session session = factory.openSession();
        //3.在Session基础上开启一个事务
        Transaction transaction = session.getTransaction();
        transaction.begin();
        //4.通过 id 获取产品obj
        Product product = session.get(Product.class, 3);
        product.setName("macBook 16寸");
        product.setPrice(168800F);
        //更新产品
        session.update(product);
        //提交事务
        transaction.commit();//不提交不能更新
        //关闭Session
        session.close();
        //关闭SessionFactory
        factory.close();
    }
}

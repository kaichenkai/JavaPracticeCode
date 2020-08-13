import com.company.pojo.Order;
import com.company.pojo.OrderItem;
import com.company.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: kaichenkai
 * @create: 8/11/2020 18:26
 */
public class Demo07ManyToManyTest {
    /**
     * 由订单查所有的产品
     *
     * @throws IOException
     */
    @Test
    public void testManyToMany() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //
        List<Order> orderList = session.selectList("listOrder");
        for (Order order : orderList) {
            System.out.println(order.getCode());
            for (OrderItem orderItem : order.getOrderItems()) {
                System.out.println(orderItem.getProduct());
            }
        }
        //
        session.commit();
        session.close();
    }

    /**
     * 建立多对多关系
     *
     * @throws IOException
     */
    @Test
    public void testCreateManyToMany() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //
        Order order = session.selectOne("getOrder", 1);
        Product product = session.selectOne("getProduct", 6);
        OrderItem orderItem = new OrderItem(200, order, product);
        session.insert("addOrderItem", orderItem);
        //
        session.commit();
        session.close();
    }

    /**
     * 由产品查询所有的订单
     */
    @Test
    public void testManyToMany2() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //
        List<Product> productList = session.selectList("listProductContainOrder");
        for (Product product : productList) {
            System.out.println(product.getName());
            System.out.println(product.getCategory().getName());
            for (OrderItem orderItem : product.getOrderItems()) {
                System.out.println(orderItem.getOrder());
            }
        }
        //
        session.commit();
        session.close();
    }

    /**
     * 由单个产品查询它所在的全部订单
     */
    @Test
    public void testManyToMany3() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //
        Product product = session.selectOne("getProductContainOrder", 1);
        System.out.println(product.getName());
        System.out.println(product.getCategory().getName());
        for (OrderItem orderItem : product.getOrderItems()) {
            System.out.println(orderItem.getOrder());
        }
        //
        session.commit();
        session.close();
    }
}

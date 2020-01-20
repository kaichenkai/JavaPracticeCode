import com.company.dao.UserDao;
import com.company.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * UserDao 的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testFindUserById(){
        int id = 1;
        User user = userDao.findUserById(id);
        System.out.println(user.toString());
    }
}
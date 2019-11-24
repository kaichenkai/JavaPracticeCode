package com.web.Servlet_05_验证码登录案例.dao;

import com.web.Servlet_05_验证码登录案例.domain.User;
import com.web.Servlet_05_验证码登录案例.util.JDBCDruidUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    // 获取连接池
        private JdbcTemplate template = new JdbcTemplate(JDBCDruidUtils.getDataSource());

    public User login(String username, String passwd) {

        try {
            // 拼写 sql
            String querySql = "select * from user where username = ? and passwd = ?";
            User user = template.queryForObject(querySql, new BeanPropertyRowMapper<User>(User.class),
                username, passwd);
            return user;
        } catch (DataAccessException e) {
//            e.printStackTrace();
            return null;
        }
    }
}

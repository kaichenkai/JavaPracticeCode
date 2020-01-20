package com.company.dao;

import com.company.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;


public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO {
    @Override
    public User findUserById(int id) throws Exception {
        // 继承 SqlSessionDaoSupport 类, 通过 this.getSqlSession() 得到 sqlSession
        SqlSession session = this.getSqlSession();
        User user = session.selectOne("findUserById", id);
        return user;
    }
}

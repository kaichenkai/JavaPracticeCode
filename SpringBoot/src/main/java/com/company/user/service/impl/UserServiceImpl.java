package com.company.user.service.impl;

import com.company.user.dto.UserAddDto;
import com.company.user.mapper.UserMapper;
import com.company.user.model.User;
import com.company.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: kaichenkai
 * @create: 7/1/2020 16:49
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional//使用sql事务
    public boolean save(UserAddDto userAddDto) throws Exception {
        userMapper.save(userAddDto);
        int a = 100/ 0;//代码报错事务不会提交, 数据不会写到数据库
//        throw new Exception("测试 sql 事务中抛出的异常");//手动抛出异常事务会提交
        return true;
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}

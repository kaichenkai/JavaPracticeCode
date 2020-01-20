package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.entity.User;
import com.company.service.UserServive;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserServive {
    @Resource
    private UserDao userDao;

    public User findUserById(int id) {
        User user = userDao.findUserById(id);
        return user;
    }
}
package com.company.dao;

import com.company.pojo.User;

public interface UserDAO {
    // 根据 id 查询用户信息
    public User findUserById(int id) throws Exception;
}
package com.company.dao;

import com.company.entity.User;

public interface UserDao {
    User findUserById(int id);
}

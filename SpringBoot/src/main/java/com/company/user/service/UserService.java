package com.company.user.service;

import com.company.user.dto.UserAddDto;
import com.company.user.model.User;
import org.springframework.stereotype.Service;

/**
 * @author: kaichenkai
 * @create: 7/1/2020 16:49
 */

public interface UserService {
    //save
    public boolean save(UserAddDto userAddDto) throws Exception;

    //findById
    public User findById(int id);
}

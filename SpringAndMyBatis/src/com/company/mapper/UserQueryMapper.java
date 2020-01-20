package com.company.mapper;

import com.company.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserQueryMapper {
    @Select("select * from user where id = #{id}")
    public User findUserById(int id) throws Exception;
}
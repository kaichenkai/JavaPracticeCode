package com.company.user.mapper;

//import com.company.demo01.dao.User;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;

import com.company.user.dto.UserAddDto;
import com.company.user.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: kaichenkai
 * @create: 7/1/2020 16:24
 */

@Mapper
public interface UserMapper {
//    @Insert("INSERT INTO t_user(username, password) VALUES(#{username}, #{password})")
//    public void save(@Param("username") String username, @Param("password") String password);
//
//    @Select("SELECT username, password FROM t_user WHERE id = #{id}")
//    public User findById(@Param("id") int id);

    public boolean save(UserAddDto userAddDto);

    public User findById(int id);
}

package com.company.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: kaichenkai
 * @create: 5/26/2020 17:19
 */

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findAll();
}

package com.company.category.mapper;

//import com.company.demo01.dao.User;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;

import com.company.category.model.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: kaichenkai
 * @create: 7/1/2020 16:24
 */

@Mapper
public interface CategoryMapper {
    public List<Category> listCategory();
}

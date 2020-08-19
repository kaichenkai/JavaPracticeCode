package com.company.category.service.impl;

import com.company.category.mapper.CategoryMapper;
import com.company.category.model.Category;
import com.company.category.service.CategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kaichenkai
 * @create: 6/16/2020 17:08
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> listCategory() {
        return categoryMapper.listCategory();
    }
}

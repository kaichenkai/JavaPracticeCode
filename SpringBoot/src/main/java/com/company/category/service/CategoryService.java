package com.company.category.service;

import com.company.category.model.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: kaichenkai
 * @create: 6/16/2020 17:08
 */
public interface CategoryService {
    public List<Category> listCategory();
}

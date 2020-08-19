package com.company.category.web;

import com.company.category.model.Category;
import com.company.category.service.CategoryService;
import com.company.core.Response;
import com.company.core.ResponseGenerator;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author: kaichenkai
 * @create: 7/2/2020 16:37
 * 请求中不同查询参数的获取
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
    static Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private CategoryService categoryService;

    @GetMapping("list")
    @ResponseBody
    public Response listCategory(
            @RequestParam(value = "offset")
            @NotNull
            @Min(0)
            Integer offset,
            @RequestParam(value = "batchCount")
            @NotNull
            @Min(0)
            Integer batchCount){
        //分页
        System.out.println(offset);
        System.out.println(batchCount);
        // TODO 沒有分頁效果
//        PageHelper.offsetPage(offset, batchCount, false);
        PageHelper.startPage(1, 2);
        List<Category> categoryList = categoryService.listCategory();
        PageInfo pageInfo = new PageInfo(categoryList);
        System.out.println(pageInfo);
        return ResponseGenerator.genSuccessResp(pageInfo);
    }
}

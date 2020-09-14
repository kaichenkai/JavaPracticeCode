package com.company.category.web;

import com.company.category.model.Category;
import com.company.category.service.CategoryService;
import com.company.core.Response;
import com.company.core.ResponseGenerator;
import com.github.pagehelper.PageHelper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
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
    @Operation(summary = "获取分类列表")//方法描述
    public Response listCategory(
            @Parameter(description = "偏移量")//参数描述
            @RequestParam(value = "offset")
            @NotNull
            @Min(0)
            Integer offset,

            @Parameter(description = "分页数量")//参数描述
            @RequestParam(value = "batchCount")
            @NotNull
            @Min(0)
            Integer batchCount){
        //分页
        PageHelper.offsetPage(offset, batchCount, false);
//        List<Category> categoryList = categoryService.listCategory();
        List<Category> categoryList = categoryService.selectAll();
        System.out.println(categoryList);
        System.out.println(categoryList.getClass());
        for (Category category : categoryList) {
            System.out.println(category);
        }
        return ResponseGenerator.genSuccessResp(categoryList);
    }
}

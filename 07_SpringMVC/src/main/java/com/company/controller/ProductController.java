package com.company.controller;

import com.company.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: kaichenkai
 * @create: 8/3/2020 10:48
 */
@Controller
@RequestMapping("product")
public class ProductController {
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ModelAndView addProduct(HttpServletRequest request, HttpServletResponse response, String name, float price){
        System.out.println(name);
        System.out.println(price);
        ModelAndView modelAndView = new ModelAndView("showProduct");
        modelAndView.addObject("product", new Product(1, name, price));
        return modelAndView;
    }
}

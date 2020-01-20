package com.company.controller;

import com.company.entity.User;
import com.company.service.UserServive;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserServive userServive;

    @RequestMapping("/findUser")
    public String findUser(Model model) {
        // 设置编码
        int id = 1;
        User user = this.userServive.findUserById(id);
        model.addAttribute("user", user);
        return "index";
    }
}
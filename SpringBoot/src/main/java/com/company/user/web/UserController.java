package com.company.user.web;

import com.company.core.Response;
import com.company.core.ResponseGenerator;
import com.company.user.dto.UserAddDto;
import com.company.user.model.User;
import com.company.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: kaichenkai
 * @create: 7/1/2020 16:24
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

//    @PostMapping(value = "add", name = "添加用户")
    @GetMapping(value = "add", name = "添加用户")
    public Response save() throws Exception {
        UserAddDto userAddDto = new UserAddDto("johny", "123456");
        userService.save(userAddDto);
        return ResponseGenerator.genSuccessResp();
    }

    @GetMapping(value = "{id}", name = "通过Id查找用户")
    public Response findById(@PathVariable int id){
        User user = userService.findById(id);
        return ResponseGenerator.genSuccessResp(user);
    }
}

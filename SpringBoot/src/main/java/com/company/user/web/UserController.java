package com.company.user.web;

import com.company.core.Response;
import com.company.core.ResponseGenerator;
import com.company.user.dto.UserAddDto;
import com.company.user.model.User;
import com.company.user.service.UserService;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author: kaichenkai
 * @create: 7/1/2020 16:24
 */

@Validated
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

    @GetMapping(value = "pathint/{id}", name = "通过Id查找用户")
    public Response findById(
            @NotNull
            @PathVariable Integer id
    ){
        User user = userService.findById(id);
        return ResponseGenerator.genSuccessResp(user);
    }

    /**
     * 带有路径参数的请求
     */
    @GetMapping(value = "pathvar/{str}/{str2}")
    public Response demoPathVar(
            @NotNull
            @Size(min = 1, max = 10, message = "路径参数格式错误")
            @PathVariable String str,
            @NotNull
            @Size(min = 1, max = 10, message = "路径参数2格式错误")
            @PathVariable String str2,
            HttpServletRequest request) {
        System.out.format("路径参数是: %s %n", str);
        System.out.println(request.getRequestURI());
        return ResponseGenerator.genSuccessResp();
    }

    /**
     * 带有查询字符串的请求(url中键值对)
     */
    @GetMapping(value = "queryString")
//    public Response demoQueryString(Long id, HttpServletRequest request){//顺序可以打乱
    public Response demoQueryString(HttpServletRequest request, Long id){
        System.out.println(id);
        System.out.println(request.getRequestURI());
        return ResponseGenerator.genSuccessResp();
    }

    /**
     * json 对象
     */
//    @PostMapping(value = "jsonObj")
    @PostMapping("jsonObj")
//    public Response demoJsonObj(User user, HttpServletRequest request){
    public Response demoJsonObj(@RequestBody @Validated UserAddDto user, HttpServletRequest request){
        System.out.println(request.getRequestURI());
        System.out.println(user.toString());//User{id=1, name='null', age=0}
        return ResponseGenerator.genSuccessResp(user);
    }

    /**
     * 一个方法匹配多个路由
     */
    @GetMapping(value = {"path1", "path2"})
    public Response demoMultiPath(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        return ResponseGenerator.genSuccessResp();
    }
}

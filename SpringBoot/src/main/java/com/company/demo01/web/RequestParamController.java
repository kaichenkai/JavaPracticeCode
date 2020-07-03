package com.company.demo01.web;

import com.company.core.Response;
import com.company.core.ResponseGenerator;
import com.company.demo01.dao.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: kaichenkai
 * @create: 7/2/2020 16:37
 * 请求中不同查询参数的获取
 */
@RestController
@RequestMapping("/param")
public class RequestParamController {
    static Logger logger = LoggerFactory.getLogger(RequestParamController.class);

    /**
     * 没有参数的请求
     */
//    @GetMapping(value = "", produces = "text/plain;charset=UTF-8")
    @GetMapping(value = "")//注解在方法上的路径会继承注解在类上的路径
    public Response index(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        return ResponseGenerator.genSuccessResp();
    }

    /**
     * 带有路径参数的请求
     */
    @GetMapping(value = "pathvar/{str}")
    public Response demoPathVar(@PathVariable String str, HttpServletRequest request) {
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
    @PostMapping(value = "jsonObj")
//    public Response demoJsonObj(User user, HttpServletRequest request){
    public Response demoJsonObj(@RequestBody User user, HttpServletRequest request){
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

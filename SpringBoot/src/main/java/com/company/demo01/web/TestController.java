package com.company.demo01.web;

import com.company.commons.jdbc.DruidDB;
import com.company.core.Response;
import com.company.core.ResponseGenerator;
import com.company.demo01.dao.User;
import com.company.demo01.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaichenkai
 * @date 2020-06-06 16:37
 */


@RestController//该注解由SpringMVC提供, 与SpringBoot没有关系
@RequestMapping("/main")//该注解由SpringMVC提供, 与SpringBoot没有关系
public class TestController {
    static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @Autowired
    private DruidDB druidDB;

    @GetMapping(value = "", name = "index")
    public Response index() {
        logger.info("index 被访问了");
        return ResponseGenerator.genSuccessResp();
    }

    //匹配路径参数(不是查询字符串参数)
    @GetMapping(value = "{id}", name = "user")
//    public Response getUser(@PathVariable(value = "id") int id) {
    public Response getUser(@PathVariable int id) {
        User user = new User(id, "johny", 12);
        return ResponseGenerator.genSuccessResp(user);
    }

    //测试全局捕获异常
    @GetMapping(value = "test/exception", name = "testGlobalException")
    public Response testException(){
        //来一个除0异常
        int a = 100 / 0;
        return ResponseGenerator.genSuccessResp();
    }

    //连接池测试
    @GetMapping(value = "druid", name = "连接池测试")
    public Response druidTest(){
        System.out.println(druidDB.toString());
        return ResponseGenerator.genSuccessResp();
    }
}

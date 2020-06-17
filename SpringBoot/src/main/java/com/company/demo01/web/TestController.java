package com.company.demo01.web;

import com.company.core.Response;
import com.company.core.ResponseGenerator;
import com.company.demo01.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaichenkai
 * @date 2020-06-06 16:37
 */

@RestController
@RequestMapping("/main")
public class TestController {
    static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @GetMapping(value = "", name = "index")
    public Response index() {
        logger.info("index 被访问了");
        return ResponseGenerator.genSuccessResp();
    }
}

package com.company.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author kaichenkai
 * @date 2020-06-13 10:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test01Logging {
    //记录器
    static Logger logger = LoggerFactory.getLogger(Test01Logging.class);
    @Test
    public void testLogging() {
        //5种日志运行级别, 依次增加,
        logger.trace("this is trace log");//跟踪信息
        logger.debug("this is debug log");//调试信息
        //SpringBoot 默认 info 级别以上
        logger.info("this is info log");//通知信息
        logger.warn("this is warning log");//警告
        logger.error("this is error log");//错误
    }
}

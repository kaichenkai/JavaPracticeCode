package com.company.test;

import com.company.commons.jdbc.DruidDB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author kaichenkai
 * @date 2020-06-13 10:49
 * DruidDB test
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test02DruidDB {
    //记录器
    static Logger logger = LoggerFactory.getLogger(Test02DruidDB.class);

    @Autowired
    private DruidDB druidDB;

    @Test
    public void testDruidDB() {
        System.out.println(druidDB.toString());
    }
}

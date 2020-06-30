package com.company.demo01.service.impl;

import com.company.demo01.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author: kaichenkai
 * @create: 6/16/2020 17:08
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String testService() {
        return "test service method execute ...";
    }
}

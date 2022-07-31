package com.ssx.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import com.ssx.service.com.ssx.interfaces.HelloService;
@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "hello";
    }
}

package com.ssx.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ssx.service.interfaces.HelloService;

@RestController
public class HelloController {
    @DubboReference
    HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(){
       return helloService.sayHello();
    }
}

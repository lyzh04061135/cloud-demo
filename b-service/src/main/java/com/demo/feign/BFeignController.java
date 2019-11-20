package com.demo.feign;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BFeignController implements BInterface {
    @Resource
    AInterface aInterface;

    @Override
    public String getString() {
        System.out.println("BFeignController getString");
        return "BFeignController:" + aInterface.getString();
    }

    @Override
    public String getString2() {
        System.out.println("BFeignController getString2");
        return "BFeignController2:";
    }
}

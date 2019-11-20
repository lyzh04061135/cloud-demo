package com.demo.feign;

import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class AFeignController implements AInterface {
    @Resource
    BInterface bInterface;

    @Override
    public String getString() {
        System.out.println("AFeignController getString");
        return "AFeignController:" + bInterface.getString2();
    }
}

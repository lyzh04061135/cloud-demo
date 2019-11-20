package com.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

@Primary
@FeignClient(name = "b-service", fallbackFactory = BFallback.class)
public interface BInterface {
    @RequestMapping(path = "/getString")
    String getString();

    @RequestMapping(path = "/getString2")
    String getString2();
}

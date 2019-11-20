package com.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

@Primary
@FeignClient(name = "a-service", fallbackFactory = AFallback.class)
public interface AInterface {
    @RequestMapping(path = "/getString")
    String getString();
}

package com.demo.feign;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AFallback implements FallbackFactory<AInterface> {

    @Override
    public AInterface create(Throwable throwable) {
        return new AInterface() {
            @Override
            public String getString() {
                log.debug("AFallback:", throwable);
                return "AFallback";
            }
        };
    }
}

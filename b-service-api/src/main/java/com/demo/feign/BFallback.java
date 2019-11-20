package com.demo.feign;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BFallback implements FallbackFactory<BInterface> {

    @Override
    public BInterface create(Throwable throwable) {
        return new BInterface() {
            @Override
            public String getString() {
                log.debug("BFallback", throwable);
                return "BFallback";
            }

            @Override
            public String getString2() {
                log.debug("BFallback2");
                return "BFallback2";
            }
        };
    }
}

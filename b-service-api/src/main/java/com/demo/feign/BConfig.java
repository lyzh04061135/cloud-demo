package com.demo.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients({"a-service", "b-service"})
public class BConfig {
    @Bean
    BFallback bFallback() {
        return new BFallback();
    }
}

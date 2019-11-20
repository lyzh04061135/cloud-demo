package com.demo.service.impl;

import com.demo.service.AService;
import org.springframework.stereotype.Component;

@Component
public class AServiceImpl implements AService {
    @Override
    public String getString() {
        return "a-service";
    }
}

package com.demo.service.impl;

import com.demo.service.BService;
import org.springframework.stereotype.Component;

@Component
public class BServiceImpl implements BService {
    @Override
    public String getString() {
        return "b-service";
    }
}

package com.example.demo.testingDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class racketCouch implements couch{
    @Override
    public String getMotive() {
        return "testing the api";
    }
}

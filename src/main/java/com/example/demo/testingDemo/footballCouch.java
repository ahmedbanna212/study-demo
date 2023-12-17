package com.example.demo.testingDemo;

import org.springframework.stereotype.Component;

@Component
public class footballCouch implements couch{
    @Override
    public String getMotive() {
        return "testing football couch";
    }
}

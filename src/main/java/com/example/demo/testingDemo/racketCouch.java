package com.example.demo.testingDemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary// if there is an interface with more than one implementation , the implementation with this annotation will be the default to get injected
@Lazy//java spring will not create and scan a bean of this class unless it was used
public class racketCouch implements couch{
    @Override
    public String getMotive() {
        return "testing the api";
    }

    public racketCouch() {
        System.out.println("racket constructor");
    }
}

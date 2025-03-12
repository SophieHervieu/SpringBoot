package com.adrar.hello.service;

import com.adrar.hello.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}

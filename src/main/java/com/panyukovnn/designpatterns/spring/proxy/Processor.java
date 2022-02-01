package com.panyukovnn.designpatterns.spring.proxy;

import org.springframework.stereotype.Service;

@Service
public class Processor {

    @Loggable
    public void process() {
        System.out.println("Doing some work...");
    }
}

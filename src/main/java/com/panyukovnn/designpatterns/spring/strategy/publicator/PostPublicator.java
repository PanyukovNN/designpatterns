package com.panyukovnn.designpatterns.spring.strategy.publicator;

import com.panyukovnn.designpatterns.spring.strategy.model.PublicatorType;
import org.springframework.stereotype.Service;

@Service
public class PostPublicator implements Publicator {

    @Override
    public void publish() {
        System.out.println("Publishing a POST");
    }

    @Override
    public PublicatorType getType() {
        return PublicatorType.POST;
    }
}

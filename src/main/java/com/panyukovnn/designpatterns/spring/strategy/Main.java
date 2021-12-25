package com.panyukovnn.designpatterns.spring.strategy;

import com.panyukovnn.designpatterns.spring.strategy.publicator.PublicatorResolver;
import com.panyukovnn.designpatterns.spring.strategy.model.PublicatorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    public PublicatorResolver publicatorResolver;

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @Override
    public void run(String... args) throws Exception {
        publicatorResolver.getPublicator(PublicatorType.POST).publish();

        publicatorResolver.getPublicator(PublicatorType.STORY).publish();

        publicatorResolver.getPublicator(PublicatorType.REELS).publish();
    }
}

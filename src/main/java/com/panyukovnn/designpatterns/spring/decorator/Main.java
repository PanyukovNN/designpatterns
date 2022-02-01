package com.panyukovnn.designpatterns.spring.decorator;

import com.panyukovnn.designpatterns.spring.decorator.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Данный паттерн позволяет выполнить необходимую логику перед и/или после
 * выполнения конкретного метода/методов класса
 *
 * Работает путём передачи сущности декорируемого объекта в конструктор декоратора (Агреграция)
 */
@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    @Qualifier("loadingServiceProfilingDecorator")
    private LoadingService profilingLoadingService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @Override
    public void run(String... args) {
        profilingLoadingService.loadAllVideos();
    }
}

package com.panyukovnn.designpatterns.decorator;

import com.panyukovnn.designpatterns.decorator.service.*;

/**
 * Данный паттерн позволяет выполнить необходимую логику перед и/или после
 * выполнения конкретного метода/методов класса
 *
 * Работает путём передачи сущности декорируемого обоъекта в конструктор декоратора (Агреграция)
 */
public class Main {

    public static void main(String[] args) {
        LoadingServiceDecorator decorated = new ProfilingDecorator(
                new LoggingDecorator(
                        new LoadingServiceImpl()));
        decorated.loadOneVideo("abcde");

        System.out.println("==================");

        decorated.loadAllVideos();
    }
}

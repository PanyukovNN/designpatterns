package com.panyukovnn.designpatterns.classic.decorator;

import com.panyukovnn.designpatterns.classic.decorator.service.LoadingServiceDecorator;
import com.panyukovnn.designpatterns.classic.decorator.service.LoadingServiceImpl;
import com.panyukovnn.designpatterns.classic.decorator.service.LoggingDecorator;
import com.panyukovnn.designpatterns.classic.decorator.service.ProfilingDecorator;

/**
 * Данный паттерн позволяет выполнить необходимую логику перед и/или после
 * выполнения конкретного метода/методов класса
 *
 * Работает путём передачи сущности декорируемого объекта в конструктор декоратора (Агреграция)
 */
public class Main {

    public static void main(String[] args) {
        LoadingServiceDecorator decorated = new ProfilingDecorator(
                new LoggingDecorator(
                        new LoadingServiceImpl()));
        decorated.loadOneVideo("Video 1");

        System.out.println("==================");

        decorated.loadAllVideos();
    }
}

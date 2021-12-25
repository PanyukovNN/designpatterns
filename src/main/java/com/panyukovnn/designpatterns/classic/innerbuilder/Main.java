package com.panyukovnn.designpatterns.classic.innerbuilder;

import com.panyukovnn.designpatterns.classic.innerbuilder.model.InstaChannel;

import java.util.Arrays;

/**
 * Реализация встроенного в класс билдера
 *
 * Данный шаблон проектирования позволяет конструировать объекты с различным набором параметров
 *
 * Наиболее известный пример - StringBuilder
 */
public class Main {

    public static void main(String[] args) {
        InstaChannel channel = InstaChannel.builder()
                .id(1L)
                .login("Hello")
                .password("World")
                .posts(Arrays.asList("cats", "dogs"))
                .build();

        System.out.println(channel);
    }
}

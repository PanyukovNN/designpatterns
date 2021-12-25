package com.panyukovnn.designpatterns.classic.state;

/**
 * Паттерн состояние
 * Цель - управление поведением объекта в зависимости от его состояния
 */
public class Main {

    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Coding());

        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivityState();
        }
    }
}

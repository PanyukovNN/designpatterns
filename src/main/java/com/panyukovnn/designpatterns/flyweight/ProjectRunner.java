package com.panyukovnn.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Паттерн - приспособленец
 * Цель - поддержка множества мелких объектов
 */
public class ProjectRunner {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpecialty("Java"));
        developers.add(developerFactory.getDeveloperBySpecialty("Java"));
        developers.add(developerFactory.getDeveloperBySpecialty("Java"));
        developers.add(developerFactory.getDeveloperBySpecialty("Java"));
        developers.add(developerFactory.getDeveloperBySpecialty("Java"));
        developers.add(developerFactory.getDeveloperBySpecialty("C++"));
        developers.add(developerFactory.getDeveloperBySpecialty("C++"));
        developers.add(developerFactory.getDeveloperBySpecialty("C++"));
        developers.add(developerFactory.getDeveloperBySpecialty("C++"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}

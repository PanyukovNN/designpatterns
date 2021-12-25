package com.panyukovnn.designpatterns.classic.visitor;

/**
 * Посетитель
 *
 * Цель - описание действий, которые происходят с объектом в некоторой структуре
 *
 * Позволяет определить новую операцию без изменения классов этих объектов
 */
public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new Project();

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        System.out.println("Junior in action...");
        project.beWritten(juniorDeveloper);

        System.out.println("==============================");

        System.out.println("Senior in action...");
        project.beWritten(seniorDeveloper);
    }
}

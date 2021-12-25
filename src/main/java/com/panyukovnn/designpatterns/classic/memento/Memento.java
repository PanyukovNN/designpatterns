package com.panyukovnn.designpatterns.classic.memento;

/**
 * Цель - сохранение внутреннего состояния объекта за его пределами
 *
 * Позволяет запоминать состояние объекта за его пределами не нарушая инкапсуляцию, а потом восстанавливать
 * в случае необходимости
 */
public class Memento {

    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);
        System.out.println();

        System.out.println("Saving current version to github...");
        githubRepo.setSave(project.save());

        System.out.println("Updating project to version 1.1");
        System.out.println("Writing bad code...");
        Thread.sleep(2000);

        project.setVersionAndDate("Version 1.1");

        System.out.println(project);
        System.out.println();

        System.out.println("Something went wrong...");
        System.out.println("Rolling back to Version 1.0");

        project.load(githubRepo.getSave());

        System.out.println(project);
        System.out.println();
    }
}

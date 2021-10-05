package com.panyukovnn.designpatterns.iterator;

/**
 * Цель - получение последовательного доступа ко всем элементам составного объекта.
 */
public class Main {

    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Gradle", "Oracle"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Nikolay", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println();
    }
}

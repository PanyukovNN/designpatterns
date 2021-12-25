package com.panyukovnn.designpatterns.classic.factorymethod;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        Developer developer = developerFactory.defineDeveloper(CodeType.JAVA);

        developer.writeCode();
    }
}

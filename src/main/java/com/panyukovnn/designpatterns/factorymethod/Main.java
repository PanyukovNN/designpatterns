package com.panyukovnn.designpatterns.factorymethod;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        Developer developer = developerFactory.defineDeveloper(CodeType.JAVA);

        developer.writeCode();
    }
}

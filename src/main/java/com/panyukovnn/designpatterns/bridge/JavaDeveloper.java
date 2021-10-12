package com.panyukovnn.designpatterns.bridge;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code...");
    }
}

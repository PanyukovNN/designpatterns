package com.panyukovnn.designpatterns.classic.bridge;

public class CppDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("C++ Developer writes C++ code...");
    }
}

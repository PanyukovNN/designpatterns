package com.panyukovnn.designpatterns.classic.simplefactory;


import org.checkerframework.checker.units.qual.C;

public class ComputerFactory {

    public static final ComputerFactory INSTANCE = new ComputerFactory();

    private ComputerFactory() {
    }

    public Computer newComputer() {
        return new Computer();
    }
}

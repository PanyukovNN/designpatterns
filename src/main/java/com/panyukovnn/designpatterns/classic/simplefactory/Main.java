package com.panyukovnn.designpatterns.classic.simplefactory;

public class Main {

    public static void main(String[] args) {
        new Computer();

        ComputerFactory.INSTANCE.newComputer();
    }
}

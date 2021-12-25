package com.panyukovnn.designpatterns.classic.bridge;

public abstract class Program {

    protected final Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}

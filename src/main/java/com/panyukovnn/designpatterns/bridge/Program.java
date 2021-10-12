package com.panyukovnn.designpatterns.bridge;

public abstract class Program {

    protected final Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}

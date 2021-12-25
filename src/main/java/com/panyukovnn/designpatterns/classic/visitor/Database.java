package com.panyukovnn.designpatterns.classic.visitor;

public class Database implements ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}

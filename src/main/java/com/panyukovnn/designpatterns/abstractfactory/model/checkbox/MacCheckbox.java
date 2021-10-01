package com.panyukovnn.designpatterns.abstractfactory.model.checkbox;

public class MacCheckbox implements Checkbox {

    @Override
    public void check() {
        System.out.println("You have created MacCheckbox.");
    }
}

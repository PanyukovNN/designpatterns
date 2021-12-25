package com.panyukovnn.designpatterns.classic.abstractfactory.model.checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void check() {
        System.out.println("You have created Windows Checkbox.");
    }
}

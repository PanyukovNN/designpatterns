package com.panyukovnn.designpatterns.abstractfactory.model.button;

public class WindowsButton implements Button {

    @Override
    public void press() {
        System.out.println("You have created Windows Button.");
    }
}

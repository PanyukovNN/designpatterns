package com.panyukovnn.designpatterns.abstractfactory.model.button;

/**
 * Mac button
 */
public class MacButton implements Button {

    @Override
    public void press() {
        System.out.println("You have created Mac Button.");
    }
}

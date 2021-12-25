package com.panyukovnn.designpatterns.classic.abstractfactory;

import com.panyukovnn.designpatterns.classic.abstractfactory.factory.AbstractFactory;
import com.panyukovnn.designpatterns.classic.abstractfactory.model.button.Button;
import com.panyukovnn.designpatterns.classic.abstractfactory.model.checkbox.Checkbox;

public class AppWindow {

    private final Button button;
    private final Checkbox checkbox;

    /**
     * ctor
     *
     * @param factory abstract factory
     */
    public AppWindow(AbstractFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void process() {
        button.press();
        checkbox.check();
    }
}

package com.panyukovnn.designpatterns.abstractfactory;

import com.panyukovnn.designpatterns.abstractfactory.factory.AbstractFactory;
import com.panyukovnn.designpatterns.abstractfactory.model.button.Button;
import com.panyukovnn.designpatterns.abstractfactory.model.checkbox.Checkbox;

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

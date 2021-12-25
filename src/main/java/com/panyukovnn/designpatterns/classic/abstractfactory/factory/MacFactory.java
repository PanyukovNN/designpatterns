package com.panyukovnn.designpatterns.classic.abstractfactory.factory;

import com.panyukovnn.designpatterns.classic.abstractfactory.model.button.Button;
import com.panyukovnn.designpatterns.classic.abstractfactory.model.checkbox.Checkbox;
import com.panyukovnn.designpatterns.classic.abstractfactory.model.button.MacButton;
import com.panyukovnn.designpatterns.classic.abstractfactory.model.checkbox.MacCheckbox;

public class MacFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

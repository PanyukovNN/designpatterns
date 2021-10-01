package com.panyukovnn.designpatterns.abstractfactory.factory;

import com.panyukovnn.designpatterns.abstractfactory.factory.AbstractFactory;
import com.panyukovnn.designpatterns.abstractfactory.model.button.Button;
import com.panyukovnn.designpatterns.abstractfactory.model.checkbox.Checkbox;
import com.panyukovnn.designpatterns.abstractfactory.model.button.MacButton;
import com.panyukovnn.designpatterns.abstractfactory.model.checkbox.MacCheckbox;

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

package com.panyukovnn.designpatterns.abstractfactory.factory;

import com.panyukovnn.designpatterns.abstractfactory.factory.AbstractFactory;
import com.panyukovnn.designpatterns.abstractfactory.model.button.Button;
import com.panyukovnn.designpatterns.abstractfactory.model.checkbox.Checkbox;
import com.panyukovnn.designpatterns.abstractfactory.model.button.WindowsButton;
import com.panyukovnn.designpatterns.abstractfactory.model.checkbox.WindowsCheckbox;

public class WindowsFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

package com.panyukovnn.designpatterns.classic.abstractfactory.factory;

import com.panyukovnn.designpatterns.classic.abstractfactory.model.button.Button;
import com.panyukovnn.designpatterns.classic.abstractfactory.model.checkbox.Checkbox;
import com.panyukovnn.designpatterns.classic.abstractfactory.model.button.WindowsButton;
import com.panyukovnn.designpatterns.classic.abstractfactory.model.checkbox.WindowsCheckbox;

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

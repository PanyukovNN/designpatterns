package com.panyukovnn.designpatterns.classic.abstractfactory.factory;

import com.panyukovnn.designpatterns.classic.abstractfactory.model.button.Button;
import com.panyukovnn.designpatterns.classic.abstractfactory.model.checkbox.Checkbox;

/**
 * Interface of factory
 */
public interface AbstractFactory {

    /**
     * Create button
     *
     * @return button entity
     */
    Button createButton();

    /**
     * Create checkbox
     *
     * @return checkbox entity
     */
    Checkbox createCheckbox();
}

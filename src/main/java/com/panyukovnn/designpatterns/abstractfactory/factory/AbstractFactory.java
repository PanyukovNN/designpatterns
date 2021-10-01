package com.panyukovnn.designpatterns.abstractfactory.factory;

import com.panyukovnn.designpatterns.abstractfactory.model.button.Button;
import com.panyukovnn.designpatterns.abstractfactory.model.checkbox.Checkbox;

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

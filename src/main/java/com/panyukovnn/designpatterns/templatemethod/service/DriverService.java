package com.panyukovnn.designpatterns.templatemethod.service;

import com.panyukovnn.designpatterns.templatemethod.model.Driver;

public abstract class DriverService {

    public void printConfiguration() {
        Driver driver = getDriver();

        System.out.println(driver.getConfiguration());
    }

    protected abstract Driver getDriver();
}

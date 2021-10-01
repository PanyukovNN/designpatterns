package com.panyukovnn.designpatterns.factorymethod.service;

import com.panyukovnn.designpatterns.factorymethod.model.Driver;

public abstract class DriverService {

    public void printConfiguration() {
        Driver driver = getDriver();

        System.out.println(driver.getConfiguration());
    }

    protected abstract Driver getDriver();
}

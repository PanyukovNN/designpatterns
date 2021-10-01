package com.panyukovnn.designpatterns.factorymethod.service;

import com.panyukovnn.designpatterns.factorymethod.model.Driver;
import com.panyukovnn.designpatterns.factorymethod.model.FirefoxDriver;

public class FirefoxDriverService extends DriverService {

    @Override
    protected Driver getDriver() {
        return new FirefoxDriver();
    }
}

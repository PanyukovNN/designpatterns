package com.panyukovnn.designpatterns.templatemethod.service;

import com.panyukovnn.designpatterns.templatemethod.model.Driver;
import com.panyukovnn.designpatterns.templatemethod.model.FirefoxDriver;

public class FirefoxDriverService extends DriverService {

    @Override
    protected Driver getDriver() {
        return new FirefoxDriver();
    }
}

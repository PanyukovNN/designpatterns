package com.panyukovnn.designpatterns.classic.templatemethod.service;

import com.panyukovnn.designpatterns.classic.templatemethod.model.Driver;
import com.panyukovnn.designpatterns.classic.templatemethod.model.FirefoxDriver;

public class FirefoxDriverService extends DriverService {

    @Override
    protected Driver getDriver() {
        return new FirefoxDriver();
    }
}

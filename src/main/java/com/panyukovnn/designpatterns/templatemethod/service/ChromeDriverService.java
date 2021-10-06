package com.panyukovnn.designpatterns.templatemethod.service;

import com.panyukovnn.designpatterns.templatemethod.model.ChromeDriver;
import com.panyukovnn.designpatterns.templatemethod.model.Driver;

public class ChromeDriverService extends DriverService {

    @Override
    protected Driver getDriver() {
        return new ChromeDriver();
    }
}

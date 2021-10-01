package com.panyukovnn.designpatterns.factorymethod.service;

import com.panyukovnn.designpatterns.factorymethod.model.ChromeDriver;
import com.panyukovnn.designpatterns.factorymethod.model.Driver;

public class ChromeDriverService extends DriverService {

    @Override
    protected Driver getDriver() {
        return new ChromeDriver();
    }
}

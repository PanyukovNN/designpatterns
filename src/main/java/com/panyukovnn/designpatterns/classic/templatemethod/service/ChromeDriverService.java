package com.panyukovnn.designpatterns.classic.templatemethod.service;

import com.panyukovnn.designpatterns.classic.templatemethod.model.ChromeDriver;
import com.panyukovnn.designpatterns.classic.templatemethod.model.Driver;

public class ChromeDriverService extends DriverService {

    @Override
    protected Driver getDriver() {
        return new ChromeDriver();
    }
}

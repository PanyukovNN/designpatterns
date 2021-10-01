package com.panyukovnn.designpatterns.factorymethod.model;

public class FirefoxDriver implements Driver {

    @Override
    public String getConfiguration() {
        return "Firefox configuration";
    }
}

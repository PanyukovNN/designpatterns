package com.panyukovnn.designpatterns.templatemethod.model;

public class FirefoxDriver implements Driver {

    @Override
    public String getConfiguration() {
        return "Firefox configuration";
    }
}

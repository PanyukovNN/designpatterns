package com.panyukovnn.designpatterns.factorymethod.model;

public class ChromeDriver implements Driver {

    @Override
    public String getConfiguration() {
        return "Google Chrome configuration";
    }
}

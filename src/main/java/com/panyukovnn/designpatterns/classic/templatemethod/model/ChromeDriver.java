package com.panyukovnn.designpatterns.classic.templatemethod.model;

public class ChromeDriver implements Driver {

    @Override
    public String getConfiguration() {
        return "Google Chrome configuration";
    }
}

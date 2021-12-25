package com.panyukovnn.designpatterns.classic.templatemethod;

import com.panyukovnn.designpatterns.classic.templatemethod.service.ChromeDriverService;
import com.panyukovnn.designpatterns.classic.templatemethod.service.DriverService;
import com.panyukovnn.designpatterns.classic.templatemethod.service.FirefoxDriverService;

public class Main {

    public static void main(String[] args) {
        DriverService chromeService = new ChromeDriverService();

        chromeService.printConfiguration();

        DriverService firefoxService = new FirefoxDriverService();

        firefoxService.printConfiguration();
    }
}

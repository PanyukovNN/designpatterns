package com.panyukovnn.designpatterns.factorymethod;

import com.panyukovnn.designpatterns.factorymethod.service.ChromeDriverService;
import com.panyukovnn.designpatterns.factorymethod.service.DriverService;
import com.panyukovnn.designpatterns.factorymethod.service.FirefoxDriverService;

public class Main {

    public static void main(String[] args) {
        DriverService chromeService = new ChromeDriverService();

        chromeService.printConfiguration();

        DriverService firefoxService = new FirefoxDriverService();

        firefoxService.printConfiguration();
    }
}

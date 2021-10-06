package com.panyukovnn.designpatterns.templatemethod;

import com.panyukovnn.designpatterns.templatemethod.service.ChromeDriverService;
import com.panyukovnn.designpatterns.templatemethod.service.DriverService;
import com.panyukovnn.designpatterns.templatemethod.service.FirefoxDriverService;

public class Main {

    public static void main(String[] args) {
        DriverService chromeService = new ChromeDriverService();

        chromeService.printConfiguration();

        DriverService firefoxService = new FirefoxDriverService();

        firefoxService.printConfiguration();
    }
}

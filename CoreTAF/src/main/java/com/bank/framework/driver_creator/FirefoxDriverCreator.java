package com.bank.framework.driver_creator;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxDriverCreator implements WebDriverCreator {
    @Override
    public RemoteWebDriver create() {
        return new FirefoxDriver();
    }
}

package com.bank.framework.driver_creator;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EdgeDriverCreator implements WebDriverCreator {
    @Override
    public RemoteWebDriver create() {
        return new EdgeDriver();
    }
}

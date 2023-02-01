package com.bank.framework;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;

public class DriverProvider implements WebDriverProvider {
    @Nonnull
    @Override
    public RemoteWebDriver createDriver(@Nonnull Capabilities capabilities) {
        return WebDriverCreatorFactory.getDriverCreator(BrowserType.getByBrowserName(
                System.getProperty("driverType"))).create();
    }
}

package com.bank.framework;

import java.util.Arrays;

public enum BrowserType {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge");

    private String browser;

    BrowserType(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public static BrowserType getByBrowserName(String browserType) {
        return Arrays.stream(BrowserType.values())
                .filter(driver -> driver.getBrowser().equals(browserType))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Driver type'" + browserType
                        + "' is not specified in Driver enum"));
    }
}

package com.bank.framework;

import com.bank.framework.driver_creator.ChromeDriverCreator;
import com.bank.framework.driver_creator.EdgeDriverCreator;
import com.bank.framework.driver_creator.FirefoxDriverCreator;
import com.bank.framework.driver_creator.WebDriverCreator;

public class WebDriverCreatorFactory {
    public static WebDriverCreator getDriverCreator(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                return new ChromeDriverCreator();
            case FIREFOX:
                return new FirefoxDriverCreator();
            case EDGE:
                return new EdgeDriverCreator();
            default:
                throw new IllegalArgumentException("No such driver exists: "
                        + browserType.getBrowser());
        }
    }
}

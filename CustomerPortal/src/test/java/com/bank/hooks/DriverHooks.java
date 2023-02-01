package com.bank.hooks;

import com.bank.framework.DriverManager;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DriverHooks {
    private static final Logger LOG = LoggerFactory.getLogger(DriverHooks.class);

    @Autowired
    DriverManager driverManager;

    @Before
    public void setUpDriver() {
        LOG.info("before driver init");
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        driverManager.initDriver();
    }
}

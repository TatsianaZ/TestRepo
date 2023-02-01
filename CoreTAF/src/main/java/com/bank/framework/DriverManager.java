package com.bank.framework;

import com.codeborne.selenide.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.open;

@Component
public class DriverManager {
    private static final Logger LOG = LoggerFactory.getLogger(DriverManager.class);

    public void initDriver() {
        LOG.info("initiating the driver");
        Configuration.browser = "chrome"; //DriverProvider.class.getName();
        Configuration.pageLoadTimeout = 200000;
        open();
    }
}

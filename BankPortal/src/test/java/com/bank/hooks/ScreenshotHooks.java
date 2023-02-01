package com.bank.hooks;

import com.codeborne.selenide.Screenshots;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import static org.apache.commons.io.FileUtils.readFileToByteArray;

public class ScreenshotHooks {
    private static final Logger LOG = LoggerFactory.getLogger(ScreenshotHooks.class);
    private static final String PNG_FILE_EXTENSION = "image/png";

    @After
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                File screenshot = Screenshots.takeScreenShotAsFile();
                String screenshotName = "Screenshot is created for scenario: " + scenario.getName()
                        + ". \nFailure date time: " + LocalDateTime.now();
                scenario.attach(readFileToByteArray(screenshot), PNG_FILE_EXTENSION,
                        screenshotName);
            } catch (IOException e) {
                LOG.error("Error creating screenshot");
            }
        }
    }
}

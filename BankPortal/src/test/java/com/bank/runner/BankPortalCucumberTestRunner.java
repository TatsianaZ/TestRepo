package com.bank.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/BankPortalCucumberTestRunner.html",
                "json:target/cucumber-reports/BankPortalCucumberTestRunner.json",
                "junit:target/cucumber-reports/BankPortalCucumberTestRunner.xml",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true,
      //  tags = "@smoke",
        glue = "com.bank",
        features = "classpath:com/bank/tests/features"
)
public class BankPortalCucumberTestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

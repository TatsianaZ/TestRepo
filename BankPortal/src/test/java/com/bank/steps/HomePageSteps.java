package com.bank.steps;

import com.bank.framework.DriverManager;
import com.bank.page_object.HomePage;
import com.bank.spring_config.ApplicationContextConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

@CucumberContextConfiguration
@SpringBootTest(classes = ApplicationContextConfig.class)
public class HomePageSteps {

    private static final Logger LOG = LoggerFactory.getLogger(HomePageSteps.class);
    @Autowired
    private HomePage homePage;

    @Given("the user navigated to Onliner home page")
    public void userNavigatedToOnlinerHomePage() {
        LOG.info("within userNavigatedToOnlinerHomePage method");
        homePage.navigateToOnlinerHomePage();
    }

    @When("the user clicks on Onliner logo")
    public void userClicksOnOnlinerLogo() {
        homePage.clickOnOnlinerLogo();
    }

    @Then("the user navigates to onliner home page")
    public void userNavigatesToOnlinerHomePage() {
        webdriver().shouldHave(url("https://www.onliner.by/"));
    }
}

package com.bank.page_object;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static java.time.Duration.ofSeconds;

@Component
public class HomePage extends BasePage {
    @Autowired
    public Header header;

    public void navigateToOnlinerHomePage() {
        open("https://www.onliner.by/");
    }

    public void clickOnOnlinerLogo() {
        header.getOnlinerLogo().shouldBe(visible, ofSeconds(2)).click();
    }
}

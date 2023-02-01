package com.bank.page_object;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$x;

@Component
public class Header {
    @Getter
    private final SelenideElement onlinerLogo =
            $x("//*[contains(@class, 'top-logo')]//imgg");
}

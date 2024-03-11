package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;


public class VerificationPage {
    private SelenideElement codeField = $ ("[data-test-id=code] input");

    private SelenideElement verefyButton = $("[data-test-id=action-verify]");

    public VerificationPage() {



    }
}

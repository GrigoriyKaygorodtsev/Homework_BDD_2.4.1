package ru.netology.web.test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import ru.netology.web.data.DataHelper;
import ru.netology.web.page.LoginPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;




public class MoneyTransferTest {

    @Test
    void shouldTransferMoneyBetweenOwnCards() {
        open("http://localhost;9999");

        var LoginPage = new LoginPage();
        var authInfo = DataHelper.getAuthInfo();
        LoginPage.validLogin(authInfo);

        $("[data-test-id=code] input").shouldBe(visible);

        //var authInfo = DataHelper.getAuthInfo();
        //$("[data-test-id=login] input").setValue(authInfo.getLogin());
        //$("[data-test-id=password] input").setValue(authInfo.getPassword());
        //$("[data-test-id=action-login]").click();
        //$("[data-test-id=code] input").shouldBe(visible);

    }
}

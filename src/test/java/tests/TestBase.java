package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import pages.MainPage;

public class TestBase {
   MainPage mainPage = new MainPage();

   @Step("Открывается стартовая страница + настройки браузера")
   @BeforeEach
   void beforeEach() {
      Configuration.browserSize = "1440x812";
      Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
      mainPage.openMainPage();
      Selenide.clearBrowserCookies();
      Selenide.clearBrowserLocalStorage();
      SelenideLogger.addListener("allure", new AllureSelenide());
   }
}

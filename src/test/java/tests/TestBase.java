package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.MainPage;

import java.util.Map;

public class TestBase {
   MainPage mainPage = new MainPage();

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = System.getProperty("browserSize", "1440x812");
      Configuration.browser = System.getProperty("browser", "chrome");
      Configuration.browserVersion = System.getProperty("browserVersion", "100");
      Configuration.baseUrl = System.getProperty("baseUrl", "https://stand-qa-06-my.b2broker.tech");
      Configuration.remote = System.getProperty("remoteUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("selenoid:options", Map.<String, Object>of(
              "enableVNC", true,
              "enableVideo", true
      ));

      Configuration.browserCapabilities = capabilities;
      Configuration.pageLoadStrategy = "eager";
   }

   @BeforeEach
   void beforeEach() {
      SelenideLogger.addListener("allure", new AllureSelenide());
   }

   @AfterEach
   void addAttachments() {
      Attach.screenshotAs("Last screenshot");
      Attach.pageSource();
      Attach.browserConsoleLogs();
      Attach.addVideo();
      Selenide.closeWebDriver();
   }
}

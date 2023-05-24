package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import pages.MainPage;

public class TestBase {
   MainPage mainPage = new MainPage();

   @BeforeEach
   void beforeEach() {
      Configuration.browserSize = "1440x812";
      mainPage.openMainPage();
      Selenide.clearBrowserCookies();
      Selenide.clearBrowserLocalStorage();
   }
}

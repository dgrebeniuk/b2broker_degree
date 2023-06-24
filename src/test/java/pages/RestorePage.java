package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RestorePage {
   private final SelenideElement restorePageTitle = $(".ng-star-inserted");

   @Step("Проверяем, что открылалась станица Restore password")
   public RestorePage verifyOpenRestorePage(String value) {
      restorePageTitle.shouldHave(text(value));

      return this;
   }
}

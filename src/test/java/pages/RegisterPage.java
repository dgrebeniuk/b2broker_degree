package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
   private final SelenideElement registrationTitle = $(".registration-type-title");

   @Step("Проверяем, что открылась страница регистрации")
   public RegisterPage verifyOpenRegistrationPage(String value) {
      registrationTitle.shouldHave(text(value));

      return this;
   }

}

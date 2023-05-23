package tests;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTests extends TestBase {

   @Test
   @DisplayName("Открывается страница регистрации")
   void openRegistrationPage() {
      mainPage.openMainPage()
              .openRegistrationPage();
   }

   @Test
   @DisplayName("Отображается QR-code для авторизации")
   void displayQrCode() {
      mainPage.openMainPage()
              .displayQrCode();
   }

   @Test
   @DisplayName("Открывается страница для восстановления пароля")
   void openRestorePassword() {
      mainPage.openMainPage()
              .openRestorePage();
   }

   @Test
   @DisplayName("Успешная авторизация")
   void successfulAuthorization() {
      $("#mat-input-0").setValue("ashaparev+1705@b2broker.com");
      $("#mat-input-1").setValue("123456As");
      $(".ng-star-inserted > .mat-focus-indicator.mat-flat-button.mat-button-base.mat-accent").click();
      $(byText("Dashboard")).shouldHave(text("Dashboard"));
   }

   @Test
   @DisplayName("Отображение пароля")
   void displayPassword() {
      $("#mat-input-1").setValue("123456As");
      $(".toggle-password-button").click();
      $("#mat-input-1").shouldHave(value("123456As"));
   }

   @Test
   @DisplayName("Установить язык RU")
   void instalRussianLunguage() {
      $("#mat-select-value-1").click();
      $("#mat-option-1").click();
      $(".mat-button-wrapper").shouldHave(text("Нет аккаунта?Зарегистрироваться сейчас!"));
   }

   @Test
   @DisplayName("Отобраажется почта службы поддержки")
   void displaySupportMail() {
      mainPage.openMainPage()
              .displaySupportMail();
   }
}

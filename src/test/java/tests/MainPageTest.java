package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {

   @BeforeEach
   void beforeEach() {
      Configuration.browserSize = "1440x812";
      open("https://stand-qa-06-my.b2broker.tech");
   }

   @Test
   @DisplayName("Открывается страница регистрации")
   void openRegistrationPage() {
      $(".mat-button-wrapper").click();
      $(".registration-type-title").shouldHave(text("Choose Registration Type"));
   }

   @Test
   @DisplayName("Отображается QR-code для авторизации")
   void displayQrCode() {
      $(".qr-code-block").shouldHave(text("QR Code Login"));
   }

   @Test
   @DisplayName("Открывается страница для восстановления пароля")
   void openResetPassword() {
      $(".restore-link").click();
      $(".ng-star-inserted").shouldHave(text("Restore a password"));
   }

   @Test
   @DisplayName("Успешная авторизация")
   void successfulAuthorization() {

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

   }

   @Test
   @DisplayName("Отобраажется почта службы поддержки")
   void displaySupportMail() {

   }
}

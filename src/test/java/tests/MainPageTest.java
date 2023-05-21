package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {

   @BeforeAll
   static void beforeAll() {
      Configuration.browserSize = "1440x812";
      open("https://stand-qa-06-my.b2broker.tech");
   }


   @Test
   @DisplayName("Открывается страница регистрации")
   void openRegistrationPage() {

   }

   @Test
   @DisplayName("Отображается QR-code для авторизации")
   void displayQrCode() {

   }

   @Test
   @DisplayName("Открывается страница для восстановления пароля")
   void openResetPassword() {

   }

   @Test
   @DisplayName("Успешная авторизация")
   void successfulAuthorization() {

   }

   @Test
   @DisplayName("Отображение пароля")
   void displayPassword() {

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

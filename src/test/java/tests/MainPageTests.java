package tests;

import org.junit.jupiter.api.*;

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
      mainPage.openMainPage()
              .setUserEmail("ashaparev+1705@b2broker.com")
              .setUserPassword("123456As")
              .clickSignInButton()
              .verifySignInTR();
   }

   @Test
   @DisplayName("Отображение пароля")
   void displayPassword() {
      mainPage.openMainPage()
              .setUserPassword("123456As")
              .clickOnTheShowPasswordButton()
              .verifyPasswordButton("123456As");
   }

   @Test
   @DisplayName("Установить язык RU")
   void instalRussianLunguage() {
      mainPage.openMainPage()
              .clickOnTheLanguageChangeButton()
              .clickOnTheLanguage()
              .verifyTheLanguageChange("Нет аккаунта?Зарегистрироваться сейчас!");
   }

   @Test
   @DisplayName("Отобраажется почта службы поддержки")
   void displaySupportMail() {
      mainPage.openMainPage()
              .displaySupportMail();
   }
}

package tests;

import org.junit.jupiter.api.*;

public class MainPageTests extends TestBase {

   String registrationPage = "Choose Registration Type",
           codeQR = "QR Code Login",
           restorePassword = "Restore a password",
           userEmail = "ashaparev+1705@b2broker.com",
           userPassword = "123456As",
           languageRu = "Нет аккаунта?Зарегистрироваться сейчас!",
           supportEmail = "Contact us at support@b2broker.net";

   @Test
   @DisplayName("Открывается страница регистрации")
   void openRegistrationPage() {
      mainPage.openMainPage()
              .openRegistrationPage()
              .verifyOpenRegistrationPage(registrationPage);
   }

   @Test
   @DisplayName("Отображается QR-code для авторизации")
   void displayQrCode() {
      mainPage.openMainPage()
              .verifyDisplayQrCode(codeQR);
   }

   @Test
   @DisplayName("Открывается страница для восстановления пароля")
   void openRestorePassword() {
      mainPage.openMainPage()
              .clickOnTheForgotYourPassword()
              .verifyOpenRestorePage(restorePassword);
   }

   @Test
   @DisplayName("Успешная авторизация")
   void successfulAuthorization() {
      mainPage.openMainPage()
              .setUserEmail(userEmail)
              .setUserPassword(userPassword)
              .clickSignInButton()
              .verifySignInTR();
   }

   @Test
   @DisplayName("Отображение пароля")
   void displayPassword() {
      mainPage.openMainPage()
              .setUserPassword(userPassword)
              .clickOnTheShowPasswordButton()
              .verifyPasswordButton(userPassword);
   }

   @Test
   @DisplayName("Отобраажется почта службы поддержки")
   void displaySupportMail() {
      mainPage.openMainPage()
              .verifyDisplaySupportMail(supportEmail);
   }

   @Disabled
   @Test
   @DisplayName("Установить язык RU")
   void instalRussianLunguage() {
      mainPage.openMainPage()
              .clickOnTheLanguageChangeButton()
              .clickOnTheLanguage()
              .verifyTheLanguageChange(languageRu);
   }
}

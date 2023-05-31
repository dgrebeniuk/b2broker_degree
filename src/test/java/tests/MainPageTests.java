package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

@Tag("simple")
public class MainPageTests extends TestBase {

   String registrationPage = "Choose Registration Type1",
           codeQR = "QR Code Login",
           restorePassword = "Restore a password1",
           userEmail = "ashaparev+1705@b2broker.ru",
           userPassword = "123456As",
           languageRu = "Нет аккаунта?Зарегистрироваться сейчас!",
           supportEmail = "Contact us at support@b2broker.net";

   @Test
   @Feature("Feature")
   @Story("Story")
   @Owner("dgrebeniuk@b2broker.com")
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Открывается страница регистрации")
   void openRegistrationPage() {
         mainPage.openRegistrationPage()
              .verifyOpenRegistrationPage(registrationPage);
   }

   @Test
   @DisplayName("Отображается QR-code для авторизации")
   void displayQrCode() {
         mainPage.verifyDisplayQrCode(codeQR);
   }

   @Test
   @DisplayName("Открывается страница для восстановления пароля")
   void openRestorePassword() {
         mainPage.clickOnTheForgotYourPassword()
                  .verifyOpenRestorePage(restorePassword);
   }

   @Test
   @DisplayName("Успешная авторизация")
   void successfulAuthorization() {
         mainPage.setUserEmail(userEmail)
              .setUserPassword(userPassword)
              .clickSignInButton()
              .verifySignInTR();
   }

   @Test
   @DisplayName("Отображение пароля")
   void displayPassword() {
         mainPage.setUserPassword(userPassword)
              .clickOnTheShowPasswordButton()
              .verifyPasswordButton(userPassword);
   }

   @Disabled("Off mail support")
   @Test
   @DisplayName("Отобраажется почта службы поддержки")
   void displaySupportMail() {
         mainPage.verifyDisplaySupportMail(supportEmail);
   }

   @Test
   @DisplayName("Установить язык RU")
   void instalRussianLunguage() {
         mainPage.clickOnTheLanguageChangeButton()
              .clickOnTheLanguage()
              .verifyTheLanguageChange(languageRu);
   }
}

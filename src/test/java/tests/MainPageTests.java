package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;


@Tag("webTest")
public class MainPageTests extends TestBase {

   String registrationPage = "Choose Registration Type",
           codeQR = "QR Code Login",
           restorePassword = "Restore a password",
           userEmail = "ashaparev+1705@b2broker.com",
           userPassword = "123456As",
           languageRu = "Нет аккаунта?Зарегистрироваться сейчас!",
           supportEmail = "Contact us at support@b2broker.net";

   @Test
   @Owner("dgrebeniuk@b2broker.com")
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Открывается страница регистрации")
   void openRegistrationPage() {
         mainPage.openMainPage()
                 .openRegistrationPage()
              .verifyOpenRegistrationPage(registrationPage);
   }

   @Test
   @Owner("dgrebeniuk@b2broker.com")
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Отображается QR-code для авторизации")
   void displayQrCode() {
         mainPage.openMainPage()
                 .verifyDisplayQrCode(codeQR);
   }

   @Test
   @Owner("dgrebeniuk@b2broker.com")
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Открывается страница для восстановления пароля")
   void openRestorePassword() {
         mainPage.openMainPage()
                 .clickOnTheForgotYourPassword()
                  .verifyOpenRestorePage(restorePassword);
   }

   @Test
   @Owner("dgrebeniuk@b2broker.com")
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Успешная авторизация")
   void successfulAuthorization() {
         mainPage.openMainPage()
                 .setUserEmail(userEmail)
              .setUserPassword(userPassword)
              .clickSignInButton()
              .verifySignInTR();
   }

   @Test
   @Owner("dgrebeniuk@b2broker.com")
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Отображение пароля")
   void displayPassword() {
         mainPage.openMainPage()
                 .setUserPassword(userPassword)
              .clickOnTheShowPasswordButton()
              .verifyPasswordButton(userPassword);
   }

   @Test
   @Owner("dgrebeniuk@b2broker.com")
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Отобраажется почта службы поддержки")
   void displaySupportMail() {
         mainPage.openMainPage()
                 .verifyDisplaySupportMail(supportEmail);
   }

   @Test
   @Owner("dgrebeniuk@b2broker.com")
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Установить язык RU")
   void instalRussianLunguage() {
         mainPage.openMainPage()
                 .clickOnTheLanguageChangeButton()
              .clickOnTheLanguage()
              .verifyTheLanguageChange(languageRu);
   }


}

package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

@Tag("main")
@Owner("dgrebeniuk@b2broker.com")
public class MainPageTests extends TestBase {

   String registrationPage = "Choose Registration Type",
           restorePassword = "Restore a password",
           languageRu = "Нет аккаунта?Зарегистрироваться сейчас!",
           supportEmail = "Contact us at support@b2broker.net";

   @Test
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Открывается страница регистрации")
   void openRegistrationPage() {
      mainPage.openMainPage()
              .openRegistrationPage();
      registerPage.verifyOpenRegistrationPage(registrationPage);
   }

   @Test
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Открывается страница для восстановления пароля")
   void openRestorePassword() {
         mainPage.openMainPage()
                 .clickOnTheForgotYourPassword();
         restorePage.verifyOpenRestorePage(restorePassword);
   }

   @Test
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Отобраажется почта службы поддержки")
   void displaySupportMail() {
         mainPage.openMainPage()
                 .verifyDisplaySupportMail(supportEmail);
   }

   @Test
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Установить язык RU")
   void instalRussianLunguage() {
      mainPage.openMainPage()
              .clickOnTheLanguageChangeButton()
              .clickOnTheLanguage()
              .verifyTheLanguageChange(languageRu);
   }
}

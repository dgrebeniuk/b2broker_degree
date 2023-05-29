package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {

   String registrationPage = "Choose Registration Type",
           codeQR = "QR Code Login",
           restorePassword = "Restore a password1",
           userEmail = "ashaparev+1705@b2broker.ru",
           userPassword = "123456As",
           languageRu = "Нет аккаунта?Зарегистрироваться сейчас!",
           supportEmail = "Contact us at support@b2broker.net";
@Disabled
   @Test
   @DisplayName("Открывается страница регистрации")
   void openRegistrationPage() {

         mainPage.openRegistrationPage()
              .verifyOpenRegistrationPage(registrationPage);
   }
   @Disabled
   @Test
   @DisplayName("Отображается QR-code для авторизации")
   void displayQrCode() {
         mainPage.verifyDisplayQrCode(codeQR);
   }

   @Test
   @DisplayName("Открывается страница для восстановления пароля")
   void openRestorePassword() {
      SelenideLogger.addListener("allure", new AllureSelenide());

      step("Кликнуть на кнопку Forgot your password?", () -> {
         mainPage.clickOnTheForgotYourPassword();
      }) ;
      step("Проверка соотвествия текста " + restorePassword, () -> {
         mainPage.verifyOpenRestorePage(restorePassword);
      }) ;
   }

   @Test
   @DisplayName("Успешная авторизация")
   void successfulAuthorization() {
         mainPage.setUserEmail(userEmail)
              .setUserPassword(userPassword)
              .clickSignInButton()
              .verifySignInTR();
   }
   @Disabled
   @Test
   @DisplayName("Отображение пароля")
   void displayPassword() {
         mainPage.setUserPassword(userPassword)
              .clickOnTheShowPasswordButton()
              .verifyPasswordButton(userPassword);
   }
   @Disabled
   @Test
   @DisplayName("Отобраажется почта службы поддержки")
   void displaySupportMail() {
         mainPage.verifyDisplaySupportMail(supportEmail);
   }
   @Disabled
   @Test
   @DisplayName("Установить язык RU")
   void instalRussianLunguage() {
         mainPage.clickOnTheLanguageChangeButton()
              .clickOnTheLanguage()
              .verifyTheLanguageChange(languageRu);
   }
}

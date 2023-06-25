package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("auth")
@Owner("dgrebeniuk@b2broker.com")
public class AuthorizationFormTests extends TestBase {
   String userEmail = "ashaparev+1705@b2broker.com",
           userPassword = "123456As",
           codeQR = "QR Code Login";

   @Test
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
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Отображение пароля")
   void displayPassword() {
      mainPage.openMainPage()
              .setUserPassword(userPassword)
              .clickOnTheShowPasswordButton()
              .verifyPasswordButton(userPassword);
   }

   @Test
   @Severity(SeverityLevel.BLOCKER)
   @DisplayName("Отображается QR-code для авторизации")
   void displayQrCode() {
      mainPage.openMainPage()
              .verifyQrCodeOnTheMainPage(codeQR);
   }
}

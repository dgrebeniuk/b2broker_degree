package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

   public MainPage openMainPage(){
      open("https://stand-qa-06-my.b2broker.tech");

      return this;
   }

   public MainPage openRegistrationPage() {
      $(".mat-button-wrapper").click();
      $(".registration-type-title").shouldHave(text("Choose Registration Type"));

      return this;
   }

   public MainPage displayQrCode() {
      $(".qr-code-block").shouldHave(text("QR Code Login"));

      return this;
   }

   public MainPage openRestorePage() {
      $(".restore-link").click();
      $(".ng-star-inserted").shouldHave(text("Restore a password"));

      return this;
   }

   public MainPage displaySupportMail() {
      $(".footer").shouldHave(text("Contact us at support@b2broker.net");

      return this;
   }

}

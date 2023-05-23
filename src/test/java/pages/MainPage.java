package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

   public MainPage openMainPage(){
      open("https://stand-qa-06-my.b2broker.tech");

      return this;
   }

   public MainPage openRegistrationPage() {
      $(".mat-button-wrapper").click();

      return this;
   }

   public MainPage verifyOpenRegistrationPage(String value) {
      $(".registration-type-title").shouldHave(text(value));

      return this;
   }

   public MainPage verifyDisplayQrCode(String value) {
      $(".qr-code-block").shouldHave(text(value));

      return this;
   }

   public MainPage clickOnTheForgotYourPassword() {
      $(".restore-link").click();

      return this;
   }

   public MainPage verifyOpenRestorePage(String value) {
      $(".ng-star-inserted").shouldHave(text(value));

      return this;
   }

   public MainPage setUserEmail(String mail) {
      $("#mat-input-0").setValue(mail);

      return this;
   }

   public MainPage setUserPassword(String password) {
      $("#mat-input-1").setValue(password);

      return this;
   }

   public MainPage clickSignInButton() {
      $(".ng-star-inserted > .mat-focus-indicator.mat-flat-button.mat-button-base.mat-accent").click();

      return this;
   }

   public MainPage verifySignInTR() {
      $(byText("Dashboard")).shouldHave(text("Dashboard"));

      return this;
   }

   public MainPage clickOnTheShowPasswordButton() {
      $(".toggle-password-button").click();

      return this;
   }

   public MainPage verifyPasswordButton(String password) {
      $("#mat-input-1").shouldHave(value(password));

      return this;
   }

   public MainPage clickOnTheLanguageChangeButton() {
      $("#mat-select-value-1").click();

      return this;
   }

   public MainPage clickOnTheLanguage() {
      $("#mat-option-1").click();

      return this;
   }

   public MainPage verifyTheLanguageChange(String value) {
      $(".mat-button-wrapper").shouldHave(text(value));

      return this;
   }

   public MainPage verifyDisplaySupportMail(String value) {
      $(".footer").shouldHave(text(value));

      return this;
   }

}

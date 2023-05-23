package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

   private final SelenideElement
           buttonRegistration = $(".mat-button-wrapper > .ng-star-inserted:nth-child(1)"),
           registrationTitle = $(".registration-type-title"),
           codeQR = $(".qr-code-block"),
           restoreLink = $(".restore-link"),
           restorePageTitle = $(".ng-star-inserted"),
           userEmail = $("#mat-input-0"),
           userPassword = $("#mat-input-1"),
           signInButton = $($(".ng-star-inserted > .mat-focus-indicator.mat-flat-button.mat-button-base.mat-accent")),
           pointMainPage = $(byText("Dashboard")),
           showPasswordButton = $(".toggle-password-button"),
           languageChangeButton = $("#mat-select-value-1"),
           languageRU = $("#mat-option-1"),
           textRU = $(".mat-button-wrapper"),
           supportEmail = $(".footer");

   public MainPage openMainPage(){
      open("https://stand-qa-06-my.b2broker.tech");

      return this;
   }

   public MainPage openRegistrationPage() {
      buttonRegistration.click();

      return this;
   }

   public MainPage verifyOpenRegistrationPage(String value) {
      registrationTitle.shouldHave(text(value));

      return this;
   }

   public MainPage verifyDisplayQrCode(String value) {
      codeQR.shouldHave(text(value));

      return this;
   }

   public MainPage clickOnTheForgotYourPassword() {
      restoreLink.click();

      return this;
   }

   public MainPage verifyOpenRestorePage(String value) {
      restorePageTitle.shouldHave(text(value));

      return this;
   }

   public MainPage setUserEmail(String mail) {
      userEmail.setValue(mail);

      return this;
   }

   public MainPage setUserPassword(String password) {
      userPassword.setValue(password);

      return this;
   }

   public MainPage clickSignInButton() {
      signInButton.click();

      return this;
   }

   public MainPage verifySignInTR() {
      pointMainPage.shouldHave(text("Dashboard"));

      return this;
   }

   public MainPage clickOnTheShowPasswordButton() {
      showPasswordButton.click();

      return this;
   }

   public MainPage verifyPasswordButton(String password) {
      userPassword.shouldHave(value(password));

      return this;
   }

   public MainPage clickOnTheLanguageChangeButton() {
      languageChangeButton.click();

      return this;
   }

   public MainPage clickOnTheLanguage() {
      languageRU.click();

      return this;
   }

   public MainPage verifyTheLanguageChange(String value) {
      textRU.shouldHave(text(value));

      return this;
   }

   public MainPage verifyDisplaySupportMail(String value) {
      supportEmail.shouldHave(text(value));

      return this;
   }

}

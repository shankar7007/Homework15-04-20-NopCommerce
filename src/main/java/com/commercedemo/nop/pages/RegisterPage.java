package com.commercedemo.nop.pages;

import com.commercedemo.nop.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerTex = By.xpath("//div[@class='page-body']//strong[text()='Your Personal Details']");

    By genderField = By.xpath("//input[@id='gender-male']");
    By firstNameField = By.xpath("//input[@id='FirstName']");
    By lastNameField = By.xpath("//input[@id='LastName']");
    By dateField = By.xpath("//select[@name='DateOfBirthDay']");
    By monthField = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearField = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By companyNameField = By.xpath("//input[@name='Company']");
    By passwordField = By.xpath("//input[@name='Password']");
    By conformPasswordField = By.xpath("//input[@name='ConfirmPassword']");
    By registerBtn = By.xpath("//input[@name='register-button']");
    By registerComplitedTex = By.xpath("//div[@class='page-body']//div[text()='Your registration completed']");


    public void assertTextYourPersonalDetail() {

        verifyTextAssertMethod(registerTex,"Your Personal Details");
    }

    public void assertRegisterCompletedText() {
        verifyTextAssertMethod(registerComplitedTex, "Your registration completed");
    }

    //This method will click on gender button
    public void clickOngenderRedioButton() {
        clickOnElement(genderField);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }
    public void enterDateField(String date) {

        sendTextToElement(dateField,date);
    }

    public void enterMonthField(String month) {
        sendTextToElement(monthField, month);
    }

    public void enterYearField(String year) {
        sendTextToElement(yearField, year);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterCompanyName(String copanyName) {
        sendTextToElement(companyNameField, copanyName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConformPassword(String password) {
        sendTextToElement(conformPasswordField, password);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerBtn);
    }

}




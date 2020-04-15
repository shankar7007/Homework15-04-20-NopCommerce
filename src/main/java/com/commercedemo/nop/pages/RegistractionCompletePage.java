package com.commercedemo.nop.pages;

import com.commercedemo.nop.utility.Utility;
import org.openqa.selenium.By;

public class RegistractionCompletePage extends Utility {

    //list of elements and their locations
    By textYourRegistrationCompleted = By.xpath("//div[@class='master-wrapper-content']//div[text()='Your registration completed']");

    //methods performing actions on elements
    public void verifyTextYourRegistrationCompleted(String str) {
        verifyTextAssertMethod(textYourRegistrationCompleted, str);
    }
}

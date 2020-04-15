package com.commercedemo.nop.pages;

import com.commercedemo.nop.utility.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {

    //list of elements and their locations
    By myAccountText = By.cssSelector("a.ico-account");

    //methods performing actions on elements
    public void verifyTextMyAccount(String str) {
        //explicit wait
        waitUntilVisibilityOfElementLocated(myAccountText,10);
        verifyTextAssertMethod(myAccountText, str);
    }

}

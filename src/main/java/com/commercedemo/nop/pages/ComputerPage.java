package com.commercedemo.nop.pages;

import com.commercedemo.nop.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    //find the all the element links and store in the variable
    By computerText = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By desktopbtn = By.xpath("//li[@class='active last']//a[contains(text(),'Desktops')]");
    By buildYourOwnComputer = By.linkText("Build your own computer");
    By hd400GB = By.xpath("//input[@id='product_attribute_3_7']");
    By addToCart = By.id("add-to-cart-button-1");
    //create method to what to do with the above link
    public void clickOnComputeTeg() {
        mouseHoverToElementAndClick(computerText);
    }
    public void verifyComputerText(String str){
        verifyTextAssertMethod(computerText,str);
    }

    public void clickOnDesktopTag() {
        clickOnElement(desktopbtn);
    }


    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);

    }

    public void clickOn400GbHD() {
        clickOnElement(hd400GB);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }
}



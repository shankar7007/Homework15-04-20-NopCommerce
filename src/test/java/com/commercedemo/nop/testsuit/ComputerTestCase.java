package com.commercedemo.nop.testsuit;

import com.commercedemo.nop.pages.BuildYourOwnComputerPage;
import com.commercedemo.nop.pages.ComputerPage;
import com.commercedemo.nop.pages.DesktopPage;
import com.commercedemo.nop.pages.HomePage;
import com.commercedemo.nop.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputerTestCase extends TestBase {

    //object creation
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();


    /*
    Test 01
    User should navigate to Computers page & Assert text "Computers"
     */
    @Test(groups = {"Sanity,Regression"})
    public void userShouldNavigateToComputerPage() {
        //click on computer tab on homepage
        homePage.clickOnComputerTab();
        //Assert text on ComputersPage
        computerPage.verifyComputerText("Computers");
    }


    /*
    Test 02
    User should navigate to Computers page, select Build your own computer,
    select 400gb HDD option radio button, select Add to cart & Assert message "The product has been added to your shopping cart"
     */
    @Test(groups = {"Smoke,Regression"})
    public void addProductToShoppingCart() {
        //click the computer tab on HomePage
        homePage.clickOnComputerTab();
        //click the desktop link on ComputerPage
        computerPage.clickOnDesktopTag();
        //click on Build your own computer on DesktopPage
        desktopPage.clickOnBuildYourOwnComputer();
        //select 400gb HDD radio button
        buildYourOwnComputerPage.clickOnHDD400GBRadioButton();
        //click on Add to cart button
        buildYourOwnComputerPage.clickOnAddToCartBtn();
        //Assert text on BuildYourOwnComputerPage when Product is added to shopping cart
        buildYourOwnComputerPage.verifyTextProductAddedToShoppingCart("The product has been added to your shopping cart");
    }



}

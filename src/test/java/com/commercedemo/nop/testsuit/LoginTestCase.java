package com.commercedemo.nop.testsuit;

import com.commercedemo.nop.loadproperty.LoadProperty;
import com.commercedemo.nop.pages.HomePage;
import com.commercedemo.nop.pages.LoginPage;
import com.commercedemo.nop.pages.MyAccountPage;
import com.commercedemo.nop.testbase.TestBase;
import org.testng.annotations.Test;

public  class LoginTestCase extends TestBase {

    //object creation
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    LoadProperty loadproperty = new LoadProperty();
    String email = loadproperty.getProperty("email");
    String password = loadproperty.getProperty("password");
    String invalidEmail = loadproperty.getProperty("invalidEmail");




    /*
     * Test case 01
     *  User should navigate to log in page successfully
     */
    @Test(priority =1, groups = {"Sanity","Regression"})
    public void userShouldNavigateToLoginPageSuccessfully() {
        //click on Login link on HomePage
        homePage.clickOnLoginLink();
        //verify text on Login page
        loginPage.verifyTextWelcomePleaseSignIn("Welcome, Please Sign In!");
    }


    /*
     * Test case 02
     * User should log in successfully using valid credentials
     */
    @Test(priority = 2,groups = {"Regression"})
    public void userShouldLoginSuccessfully() {
        //click Login link on HomePage
        homePage.clickOnLoginLink();

        //send text to email field on LoginPage same email as used for registration
        loginPage.sendTextToEmailField(invalidEmail);

        //send text to password field on LoginPage
        loginPage.sendTextToPasswordField(password);

        //click on login button on LoginPage
        loginPage.clickOnLoginButton();

        //Assert text on MyAccountPage
        myAccountPage.verifyTextMyAccount("My account");
    }
@Test(priority = 3,groups ={"Smoke","Regression"})
    public void userShouldNotLoginSuccessfullyWithInvalidCredentials(){

        homePage.clickOnLoginLink();

        //send text to email field on LoginPage same email as used for registration
        loginPage.sendTextToEmailField(email);

        //send text to password field on LoginPage
        loginPage.sendTextToPasswordField(password);

        loginPage.clickOnLoginButton();

        loginPage.verifyErrorMassageOnUnSuccessfullLogin("Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect");
    }
}

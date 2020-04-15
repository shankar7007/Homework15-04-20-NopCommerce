package com.commercedemo.nop.testsuit;

import com.commercedemo.nop.loadproperty.LoadProperty;
import com.commercedemo.nop.pages.HomePage;
import com.commercedemo.nop.pages.RegisterPage;
import com.commercedemo.nop.testbase.TestBase;
import com.commercedemo.nop.utility.Utility;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTestCase extends TestBase {

    String email = null;

    //object creaction
    HomePage homePage = new HomePage();
    RegisterPage registerpage = new RegisterPage();
    LoadProperty loadProperty = new LoadProperty();

    //getting keys from config.properties
    String firstName = loadProperty.getProperty("firstName");
    String  lastName = loadProperty.getProperty("lastName");
    String password = loadProperty.getProperty("password");
    String companyName = loadProperty.getProperty("companyName");
    String dayDOB = loadProperty.getProperty("dayDOB");
    String monthDOB = loadProperty.getProperty("monthDOB");
    String yearDOB = loadProperty.getProperty("yearDOB");


//assigning random value gpr email every time test cases run
    @BeforeTest
    public void sendemail() {
        email = "test" + Utility.getRandomString(5) + "@gmail.com";
    }

    @Test(priority = 0 ,groups ={"Sanity","Regression"})
    public void varifyUserShouldNavigateToRegisterPage() {
        homePage.clickOnRegisterLink();
        registerpage.assertTextYourPersonalDetail();
    }
    @Test(priority = 1 , groups = {"Smoke", "Regression"})
    public void varifyUserShouldRegisterSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        Thread.sleep(3000);
        registerpage.clickOngenderRedioButton();
        registerpage.enterFirstName("firstName");
        registerpage.enterLastName("lastName");
        registerpage.enterDateField("dayDOB");
        registerpage.enterMonthField("monthDOB");
        registerpage.enterYearField("yearDOB");
        registerpage.enterEmailId(email);
        registerpage.enterCompanyName("companyName");
        registerpage.enterPassword(password);
        registerpage.enterConformPassword(password);
        registerpage.clickOnRegisterButton();

        registerpage.assertRegisterCompletedText();

    }
}


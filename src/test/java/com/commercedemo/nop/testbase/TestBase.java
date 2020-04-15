package com.commercedemo.nop.testbase;

import com.commercedemo.nop.basepage.BasePage;
import com.commercedemo.nop.browserselector.BrowserSelector;
import com.commercedemo.nop.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
// object creaction
    BrowserSelector browserselector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

// getting "baseUrl" and "browser" value from confing.propertioes
    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

    @BeforeMethod(groups = {"Sanity","Smoke","Regression"})
    public void openBrowser() {
        browserselector.selectBrowser(browser);
        driver.manage().window().maximize();
        // driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod(groups = {"Sanity","Smoke","Regression"})
    public void tearDown() {
        driver.quit();
        ;
    }
}

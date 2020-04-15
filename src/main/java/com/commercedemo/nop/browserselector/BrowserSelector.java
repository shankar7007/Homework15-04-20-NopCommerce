package com.commercedemo.nop.browserselector;

import com.commercedemo.nop.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends BasePage {
    String projectPath = System.getProperty("user.dir");

        public void selectBrowser(String browser) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", projectPath + "/driver/geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("ie")) {
                System.setProperty("webdriver.ie.driver", projectPath + "/driver/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            } else {
                System.out.println("wrong browser name");
            }
        }

}

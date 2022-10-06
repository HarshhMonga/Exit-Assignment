package tests;

import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class gotoCart extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(gotoCart.class);

    @Test
    public void cart() throws InterruptedException {
        test.log(LogStatus.INFO,"Login using credentials");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(2000);
//        clicking on cart button
        test.log(LogStatus.INFO,"Going to cart");
        driver.findElement(LoginPage.gotoCart).click();
    }
}

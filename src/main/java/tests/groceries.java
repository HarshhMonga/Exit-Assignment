package tests;

import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class groceries extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(groceries.class);
    @Test
    public void groceriespage() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Login Using credentials");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(username);
        driver.findElement(LoginPage.password_field).sendKeys(password);
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(2000);
//        clicking on groceries button
        logger.info("Groceries Button Clicked");
        driver.findElement(commonPage.groceries).click();
    }
}

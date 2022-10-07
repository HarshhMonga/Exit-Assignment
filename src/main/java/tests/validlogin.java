package tests;

import BasePages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class validlogin extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(validlogin.class);

    @Test
    public void signIn() {
        test.log(LogStatus.INFO,"Test Passed");

        logger.info("Logging in using the valid credentials");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(username);
        driver.findElement(LoginPage.password_field).sendKeys(password);
        driver.findElement(LoginPage.continue_btn).click();
    }
}

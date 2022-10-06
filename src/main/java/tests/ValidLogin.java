package tests;

import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLogin extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(ValidLogin.class);

    @Test
    public void signIn() {
        test.log(LogStatus.INFO,"Logging in using the valid credentials");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.continue_btn).click();
    }
}

package tests;

import BasePages.LoginPage;
import BasePages.SignupPage;
import Utilities.ReadingPropertiesFile;
import org.testng.annotations.Test;

public class signUp extends BasePages.mainPage {
    @Test
    public void SignUp() throws InterruptedException {
        // click on sign up button
        driver.findElement(SignupPage.newUSer).click();
        Thread.sleep(2000);
//        entering the mobile number
        driver.findElement(SignupPage.mobNumber).sendKeys(ReadingPropertiesFile.getProperty("mobileNumber"));
//        click on continue button
        driver.findElement(SignupPage.contBTN).click();

    }
}

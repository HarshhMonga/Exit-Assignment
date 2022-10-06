package tests;

import BasePages.LoginPage;
import BasePages.SignupPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class signUp extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(signUp.class);
    @Test
    public void SignUp() throws InterruptedException {
        test.log(LogStatus.INFO,"Signing up");
        // click on sign up button
        driver.findElement(SignupPage.newUSer).click();
        Thread.sleep(2000);
//        entering the mobile number
        test.log(LogStatus.INFO,"Entering Mobile number");
        driver.findElement(SignupPage.mobNumber).sendKeys(ReadingPropertiesFile.getProperty("mobileNumber"));
//        click on continue button
        driver.findElement(SignupPage.contBTN).click();

    }
}

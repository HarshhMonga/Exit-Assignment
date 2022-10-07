package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import myjar.Common;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class fashions extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(fashions.class);
    @Test
    public void fashion() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Closing Login Popup");
        //        closing the login pop up
        Common.clickOnElement(driver.findElement(commonPage.crossButton));
        Thread.sleep(2000);
//        clicking on fashion button
        logger.info("Fashion button clicked");
        driver.findElement(commonPage.fashion).click();
    }
}

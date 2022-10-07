package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import myjar.Common;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class topOffers extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(topOffers.class);
    @Test
    public void offers() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Closing Login Popup");
        //        closing the login pop up
        Common.clickOnElement(driver.findElement(commonPage.crossButton));//        clicking top offers button
        logger.info("navigating to top offers");
        driver.findElement(commonPage.topOffer).click();
        Thread.sleep(2000);
    }
}

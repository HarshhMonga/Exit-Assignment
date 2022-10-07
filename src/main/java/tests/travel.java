package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import myjar.Common;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class travel extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(travel.class);
    @Test
    public void travelpage(){
        test.log(LogStatus.INFO,"Test Passed");

        logger.info("Closing Login Popup");
        //        closing the login pop up
        Common.clickOnElement(driver.findElement(commonPage.crossButton));
//        clicking on travel button
        logger.info("going to travel page");
        driver.findElement(commonPage.travel).click();
    }
}

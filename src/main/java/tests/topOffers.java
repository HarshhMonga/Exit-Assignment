package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class topOffers extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(topOffers.class);
    @Test
    public void offers() throws InterruptedException {
        test.log(LogStatus.INFO,"Closing Login Popup");
        //        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
//        clicking top offers button
        test.log(LogStatus.INFO,"navigating to top offers");
        driver.findElement(commonPage.topOffer).click();
        Thread.sleep(2000);
    }
}

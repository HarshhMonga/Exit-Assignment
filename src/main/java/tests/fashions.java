package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class fashions extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(fashions.class);
    @Test
    public void fashion() throws InterruptedException {
        test.log(LogStatus.INFO,"Closing Login Popup");
        //        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
        Thread.sleep(2000);
//        clicking on two wheeler button
        test.log(LogStatus.INFO,"Fashion button clicked");
        driver.findElement(commonPage.fashion).click();
    }
}

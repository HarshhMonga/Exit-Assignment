package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import myjar.Common;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class explorePlus extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(explorePlus.class);
    @Test
    public void plus() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Closing Login Popup");
//        closing the login pop up

        Common.clickOnElement(driver.findElement(commonPage.crossButton));
        logger.info("Explore Page Clicking");
//        clicking the explore page button
        driver.findElement(commonPage.explorePlus).click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        String expectedTitle = "Flipkart Plus – The Ultimate Rewards Program for Flipkart Customers | Flipkart";
        Assert.assertEquals(expectedTitle,title);
    }
}

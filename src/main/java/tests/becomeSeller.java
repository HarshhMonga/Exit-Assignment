package tests;
import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import myjar.Common;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class becomeSeller extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(becomeSeller.class);
    @Test
    public void groceriespage() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Closing login Popup");
//        closing the login pop up
        Common.clickOnElement(driver.findElement(commonPage.crossButton));
//        click on becomeseller button
        logger.info("Opening Becomeseller page");
        driver.findElement(commonPage.becomeSeller).click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        String expectedTitle = "Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce";
        Assert.assertEquals(expectedTitle,title);
    }
}

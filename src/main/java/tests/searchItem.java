package tests;

import BasePages.commonPage;
import BasePages.searchPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import myjar.Common;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class searchItem extends BasePages.mainPage{

    public  static Logger logger = Logger.getLogger(searchItem.class);

    @Test
    public void search(){
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Closing Login Popup");
        //        closing the login pop up
        Common.clickOnElement(driver.findElement(commonPage.crossButton));
//    searching the item
    logger.info("Searching the item");
    driver.findElement(searchPage.searchBar).sendKeys(ReadingPropertiesFile.getProperty("searchItem"));
    driver.findElement(searchPage.searchButton).click();
    }
}

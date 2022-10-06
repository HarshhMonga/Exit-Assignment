package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class explorePlus extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(explorePlus.class);
    @Test
    public void plus(){
        test.log(LogStatus.INFO,"Closing Login Popup");
//        closing the login pop up

        driver.findElement(commonPage.crossButton).click();
        test.log(LogStatus.INFO,"Explore Page Clicking");
//        clicking the explore page button
        driver.findElement(commonPage.explorePlus).click();
    }
}

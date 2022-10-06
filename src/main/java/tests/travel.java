package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class travel extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(travel.class);
    @Test
    public void travelpage(){
        test.log(LogStatus.INFO,"Closing Login Popup");
        //        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
//        clicking on travel button
        test.log(LogStatus.INFO,"going to travel page");
        driver.findElement(commonPage.travel).click();
    }
}

package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class becomeSeller extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(becomeSeller.class);
    @Test
    public void groceriespage(){
        test.log(LogStatus.INFO,"Test Passed");
//        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
//        click on becomeseller button
        test.log(LogStatus.INFO,"Opening Becomeseller page");
        driver.findElement(commonPage.becomeSeller).click();

    }
}

package tests;

import BasePages.commonPage;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class carouselScroll extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(carouselScroll.class);
    @Test
    public void carousel() throws InterruptedException {
        test.log(LogStatus.INFO,"Closing Login Popup");
//        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
//        iterate to next the carousel 5 times
        test.log(LogStatus.INFO,"Iterating the carousel next 5 times");
        for(int i=1;i<=6;i++) {
            driver.findElement(commonPage.carousel).click();
            Thread.sleep(500);
        }
    }
}

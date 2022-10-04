package tests;

import BasePages.commonPage;
import org.testng.annotations.Test;

public class travel extends BasePages.mainPage {
    @Test
    public void travelpage(){
        //        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
//        clicking on travel button
        driver.findElement(commonPage.travel).click();
    }
}

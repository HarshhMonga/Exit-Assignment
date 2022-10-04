package tests;

import BasePages.commonPage;
import org.testng.annotations.Test;

public class explorePlus extends BasePages.mainPage {
    @Test
    public void plus(){
//        closing the login pop up

        driver.findElement(commonPage.crossButton).click();
//        clicking the explore page button
        driver.findElement(commonPage.explorePlus).click();
    }
}

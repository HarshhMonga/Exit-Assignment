package tests;

import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;
import org.testng.annotations.Test;

public class twowheeler extends BasePages.mainPage {
    @Test
    public void groceriespage() throws InterruptedException {
        //        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
        Thread.sleep(2000);
//        clicking on two wheeler button
        driver.findElement(commonPage.twoWheeler).click();
    }
}

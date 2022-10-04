package tests;

import BasePages.commonPage;
import org.testng.annotations.Test;

public class becomeSeller extends BasePages.mainPage {
    @Test
    public void groceriespage(){
//        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
//        click on becomeseller button
        driver.findElement(commonPage.becomeSeller).click();
    }
}

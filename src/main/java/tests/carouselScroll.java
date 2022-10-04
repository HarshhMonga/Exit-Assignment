package tests;

import BasePages.commonPage;
import org.testng.annotations.Test;

public class carouselScroll extends BasePages.mainPage {
    @Test
    public void carousel() throws InterruptedException {
//        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
//        iterate to next the carousel 5 times
        for(int i=1;i<=5;i++) {
            driver.findElement(commonPage.carousel).click();
            Thread.sleep(500);
        }
    }
}

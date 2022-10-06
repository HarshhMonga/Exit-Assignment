package tests;
import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class downloadApp extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(downloadApp.class);
    @Test
    public void downlaod() throws InterruptedException {
        test.log(LogStatus.INFO,"Closing the Login Popup");
        //        closing the login pop up
        driver.findElement(commonPage.crossButton).click();
        Thread.sleep(3000);
//        hover over more button
        test.log(LogStatus.INFO,"Clicking more button");
        WebElement more = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(more).build().perform();
        Thread.sleep(3000);
//        clicking the download button
        test.log(LogStatus.INFO,"Download App button clicked");
        WebElement downApp = driver.findElement(By.xpath("//div[contains(text(),'Download App')]"));
        actions.moveToElement(downApp).click().build().perform();
    }
}
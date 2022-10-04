package tests;

import BasePages.LoginPage;
import BasePages.commonPage;
import BasePages.searchPage;
import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class addtoCart extends BasePages.mainPage{
    @Test
    public void addtocart() throws InterruptedException {
//        login via credentials
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(2000);
//        searching the item
        driver.findElement(searchPage.searchBar).sendKeys(ReadingPropertiesFile.getProperty("searchItem"));
        driver.findElement(searchPage.searchButton).click();
        Thread.sleep(2000);
//        clciking the element
        driver.findElement(commonPage.firstItem).click();
//        setting selenium to access data from new tab
        Set<String> window = driver.getWindowHandles();
        Iterator<String> iterate = window.iterator();
        iterate.next();
        String secondWindow = (String)iterate.next();
        driver.switchTo().window(secondWindow);
//        adding item to cart
        driver.findElement(commonPage.addtoCart).click();
    }
}

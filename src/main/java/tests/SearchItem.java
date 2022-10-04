package tests;

import BasePages.commonPage;
import BasePages.searchPage;
import Utilities.ReadingPropertiesFile;
import org.testng.annotations.Test;

public class SearchItem extends BasePages.mainPage{

    @Test
    public void search(){
        //        closing the login pop up
    driver.findElement(commonPage.crossButton).click();
//    searching the item
    driver.findElement(searchPage.searchBar).sendKeys(ReadingPropertiesFile.getProperty("searchItem"));
    driver.findElement(searchPage.searchButton).click();
    }
}

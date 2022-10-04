package BasePages;

import Utilities.ExtentManager;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class mainPage {
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;
    @BeforeSuite
    public void inintializeSetup() {
        String browser = ReadingPropertiesFile.getProperty("browser");
        String mode = ReadingPropertiesFile.getProperty("mode");
        String chromebrowser = ReadingPropertiesFile.getProperty("chrome_path");
        String firefoxbrowser = ReadingPropertiesFile.getProperty("firefox_path");
//       driver code to run the browser
        if (mode.equals("non-headless")){
            if (browser.equals("chrome")){
                System.setProperty("webdriver.chrome.driver",chromebrowser);
                driver = new ChromeDriver();
            }
            else if (browser.equals("firefox")){
                System.setProperty("webdriver.gecko.driver",firefoxbrowser);
                driver = new FirefoxDriver();
            }
            else if (browser.equals("ie")){
                System.setProperty("webdriver.ie.driver", "C:\\Users\\piyushpandey\\Downloads\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
            else System.out.println("browser name is invalid");

        }
        else if (mode.equals("headless")) {
            if (browser.equals("chrome")){
                System.setProperty("webdriver.chrome.driver",chromebrowser);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("headless");
                driver = new ChromeDriver(options);
            }
            else if (browser.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver",firefoxbrowser);
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("headless");
                driver = new FirefoxDriver(options);
            }
            else System.out.println("browser name is invalid");
        }


        driver.manage().window().maximize();





        extent = ExtentManager.getInstance("ExtentReports\\report.html");

    }

    @BeforeMethod
    public void openApplicationUrl(Method method) {

        //Go To The Application URL
        driver.get(ReadingPropertiesFile.getProperty("url"));
        test = extent.startTest(method.getName());
    }
}

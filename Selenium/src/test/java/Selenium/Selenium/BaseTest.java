package Selenium.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

	private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }
    
    @AfterTest
    public void afterTest() {
            driver.quit();
        }
    

    public WebDriver getDriver() {
        return driver;
    }
}

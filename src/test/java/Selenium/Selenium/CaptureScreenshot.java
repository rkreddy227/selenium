package Selenium.Selenium;

//package softwareTestingMaterial;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	
	@Test
	public static void captureScreenMethod() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
		driver.close();
		driver.quit();		
	}
}

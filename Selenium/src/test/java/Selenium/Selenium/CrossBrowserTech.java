package Selenium.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTech {

	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");

			driver= new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver.exe");
			driver= new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	
	
	
	
}

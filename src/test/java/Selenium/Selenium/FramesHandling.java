package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FramesHandling {

	@Test
	public void jobsearchOnAllegisGroupHomePageBasic() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.allegisgroup.com";

		//When we have frames in the web page , we need to identify it and need to switch to the frame .
		//Either frame will have ID or Number  we can use them to identify the frame.

		
		driver.switchTo().frame("byID");
		driver.switchTo().frame("byNumber");

		//After we are done with frame we have to switch to default with following command 
		driver.switchTo().defaultContent();

	}
}

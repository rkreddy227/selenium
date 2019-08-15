package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsMOuseHover {

	@Test
	public void jobsearchOnAllegisGroupHomePageBasic() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.allegisgroup.com";

		//We have Actions Class in Selenium and we can create a Object for Actions class and we have to pass driver for this object.
		//With this actions object we have multiple methods that we can use like moveToElement
		

		WebElement ele = driver.findElement(By.xpath("xpath"));
		//Create object 'action' of an Actions class
		Actions action = new Actions(driver);
		//Mouseover on an element
		action.moveToElement(ele).perform();

	}
}

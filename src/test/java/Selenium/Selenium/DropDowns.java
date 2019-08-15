package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDowns {

	// https://www.allegisgroup.com
	@Test
	public void jobsearchOnAllegisGroupHomePageBasic() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.allegisgroup.com";

		// To work with Drop downs we can use Select class in the selenium .
		// Create select object and pass the dropdown element. Then we have 3
		// different methods to work
		// SelectByValue, SelectByVisibleText, Select by index.

		WebElement SelectElement = driver.findElement(By.name("dropdown"));
		Select dropdown = new Select(SelectElement);
		dropdown.selectByVisibleText("txt");
		dropdown.selectByIndex(2);
		dropdown.selectByValue("Value");

	}

}

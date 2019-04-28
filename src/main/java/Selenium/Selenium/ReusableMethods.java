package Selenium.Selenium;

import org.openqa.selenium.WebDriver;

public class ReusableMethods extends BasePage {

	public ReusableMethods(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}

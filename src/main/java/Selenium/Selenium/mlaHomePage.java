package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mlaHomePage extends BasePage {

	public mlaHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//li[@class='score-megamenu-dropdown  ']/a")
	private WebElement homeLocations;
	
	public void mlaHomeLocations() {
		 homeLocations.click();
		
	}
	
	
	
	//FindBy(xpath="")
	

}

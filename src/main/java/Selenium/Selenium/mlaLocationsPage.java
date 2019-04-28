package Selenium.Selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mlaLocationsPage extends BasePage {

	public mlaLocationsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//div[@class='location-detail-wrapper']")
	private List<WebElement> locationsCountList;
	
	public int mlaLocationsList() {
		return locationsCountList.size();
		
	}
	
	
}

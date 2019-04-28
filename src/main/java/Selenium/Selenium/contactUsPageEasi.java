package Selenium.Selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class contactUsPageEasi extends BasePage {

	public contactUsPageEasi(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}

	//@FindBy(xpath="//span[text()='Our Offices']")
	//private WebElement ourOfficesH2;
	@FindBy(xpath="//li[@class='acs-location-item']")
	private List<WebElement> allLocations;
	
	@FindBy(xpath="(//div[@class='score-button-group ']/a[2])[2]")
	private WebElement careerContactus;
	
	
	public int getLocactionsTileSize() {
		return allLocations.size();
	}
	
	public void CareerContactUs() {
		 careerContactus.click();
	}
	
	
	

}

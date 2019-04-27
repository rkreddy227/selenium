package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class easiHomePage extends BasePage {

	public easiHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	 	}
	
	//page locators 
	@FindBy(xpath="//li/a[text()='Contact Us']")
	private WebElement headerContactUsLink;
	@FindBy(xpath="//button[@title='Got It!']")
	private WebElement buttonGotit;
	
	//Search page
	@FindBy(xpath="//img[@alt ='Search Icon']")
	private WebElement headerSearchBut;
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement headerSearchText;
	@FindBy(xpath="//a[text()='Search']")
	private WebElement headerSearchSubmitButton;
	
	
	

	//Page Methods
	public void ClickContactUs() {
		headerContactUsLink.click();
	}

	public void clickGotit() {
		buttonGotit.click();
	}
	
	public void clickSearch() {
		headerSearchBut.click();
	}
	
	public void TextSearch(String keyword) {
		headerSearchText.click();
		headerSearchText.sendKeys(keyword);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				//System.out.println(headerSearchText.isSelected());
		//System.out.println("search text is " +headerSearchText.getAttribute("")
		headerSearchSubmitButton.click();
	}
	
}

package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class guruHomePage extends BasePage {

	public guruHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@name='uid']")
	private WebElement user99GuruName;
	@FindBy(xpath="//input[@name='password']")
	   private WebElement password99Guru;

	@FindBy(xpath="//input[@name = 'btnLogin']")
	private WebElement loginButton;
	
	
	public void setUserName(String strUserName) {

	user99GuruName.sendKeys(strUserName);
	}

	public void setPassword(String strPassword) {
		password99Guru.sendKeys(strPassword);

	}
	
	public void clickloginButton() {
		loginButton.click();

}
}
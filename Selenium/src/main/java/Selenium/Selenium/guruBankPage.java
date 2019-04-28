package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class guruBankPage extends BasePage {

	public guruBankPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	@FindBy(xpath="(//*[@class='heading3'])[1]")
	private WebElement managePage;

    public String mangeBankPage() {
    	return managePage.getText();
    }
	
}

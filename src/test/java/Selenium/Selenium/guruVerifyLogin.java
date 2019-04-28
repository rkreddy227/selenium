package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class guruVerifyLogin {
	
	@Test
	public void VerifyValidLogin() {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4/");
		
		LoginPage login = new LoginPage(driver);
		
		login.typeUserName();
		login.typePassword();
		login.clickloginButton();
		
		driver.quit();
		
		
	}


}

package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By username = By.xpath("//input[@name='uid']");
	By password = By.xpath("//input[@name='password']");
	By loginButton = By.xpath("//input[@name = 'btnLogin']");

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void typeUserName()
	{
       driver.findElement(username).sendKeys("admin");
       
	}
	
	
	public void typePassword() {
		driver.findElement(password).sendKeys("demo123");
	}
	
	public void clickloginButton() {
		driver.findElement(loginButton).click();
		
		
	}
	
	
	}
	

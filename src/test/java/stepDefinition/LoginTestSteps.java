package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTestSteps {
	
	public static WebDriver driver;
	
	// Text value in Given 
	@Given("^A user is on store.demoqa.com$")
	public void A_user_is_on_store_demoqa_com() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://shop.demoqa.com/");
		
		throw new PendingException();
	}

	@When("^user clicks on MyAccount link$")
	public void user_clicks_on_MyAccount_link() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //WebElement myAccount =driver.findElement(By.xpath("//*[@class='pull-right noo-topbar-right']//li[2]"));
		//myAccount.click();
		
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		throw new PendingException();
	}

	@And("^user logs in using valid username and password$")
	public void user_logs_in_using_valid_username_and_password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.id("log")).sendKeys("testuser_1"); 
	     driver.findElement(By.id("pwd")).sendKeys("Test@123");
	     driver.findElement(By.id("login")).click();
		
	    
		
		throw new PendingException();
	}

	@Then("^user is taken to the myaccount page$")
	public void user_is_taken_to_the_myaccount_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    
		System.out.println("Login Successfully");
		throw new PendingException();
	    
	}
}


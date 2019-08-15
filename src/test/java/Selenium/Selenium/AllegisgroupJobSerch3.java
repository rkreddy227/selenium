package Selenium.Selenium;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AllegisgroupJobSerch3 {

	
	/*
	 * Scenario: Verify that user able to successfully login to demoqa.com website
	 * Given A user is on login page When user enters an invalid username and valid
	 * password Then Application should deny login to the user
	 */
	
	
	
	
	
	//https://www.allegisgroup.com
	//@Test
	public void jobsearchOnAllegisGroupHomePage() {
		System.out.println("this is my first test");
		//assertTrue(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		String baseUrl = "https://www.spicejet.com/";
			driver.get(baseUrl);
	
	    driver.findElement(By.id("divpaxinfo")).click();
	 
	    for(int i=1;i<5;i++) {
	    driver.findElement(By.id("hrefIncAdt")).click();
	 
	
	   }
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	
	
	
	
	}
	
	@Test
	public void jobsearchOnAllegisGroupHomePage11() {
		System.out.println("this is my first test2");		
		
			assertTrue(true);
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
			String baseUrl = "https://www.spicejet.com/";
				driver.get(baseUrl);
	      WebElement seniorCheckbox= driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
				//System.out.println(seniorCheckbox.click());
	      //seniorCheckbox.click();
	      //System.out.println(seniorCheckbox.isSelected());
			List<WebElement> checkBoxList = driver.findElements(By.cssSelector("input[type='checkbox']"));
			//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				
			
		//	for(int i=0;i<checkBoxList.size();i++) {
		//		checkBoxList.get(i).click();
		//		System.out.println("checkbox list names"+checkBoxList.get(i).getAttribute("value"));
			//}
			
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());

			driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();;
			System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
	        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			 {
				System.out.println("is Enabled");
				
				
			 }
			else
			{
			  Assert.assertTrue(true);	
			}
			
	
	}
	
	
	
	//@Test
	public void jobsearchOnAllegisGroupHomePage1() {
		System.out.println("this is my first test2");		
		
			assertTrue(true);
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
			String baseUrl = "https://www.spicejet.com/";
				driver.get(baseUrl);
			
				//Dynamic dropdown 
				//a[@value='HYD']
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
			//driver.findElement(By.xpath("//table[@id='citydropdown'] //a[@value='HYD']")).click();
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
		
		
		
		
		
		
		
	}
	
	//@Test
	public void jobsearchOnAllegisGroupHomePage2() {
		System.out.println("this is my first test3");
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		String baseUrl ="https://www.makemytrip.com/";
			driver.get(baseUrl);
			
			//driver.findElement(By.xpath("//input[@placeholder='From']")).click();
			
			driver.findElement(By.xpath("//label[@for='fromCity']")).click();
			
			//driver.findElement(By.xpath("//input[@placeholder='From']")).click();
			//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("BOM");
			//driver.findElement(By.xpath("//input[@placeholder='From'")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//input[@type='text' and @placeholder='From']")).click();
			driver.findElement(By.xpath("//input[@type='text' and @placeholder='From']")).sendKeys("BOM");
			
			//This is to select first itm in the suggesion list 
			//driver.findElement(By.xpath("//*[@id='react-autowhatever-1']//li[@data-suggestion-index=0]")).click();
			
			//List<WebElement> fromSugg = driver.findElements(By.xpath("//*[@id='react-autowhatever-1']//li//div[@class='pushRight font14 lightGreyText latoBold']"));
			
			
			
			//driver.findElement(By.id("react-autowhatever-1")).clear();
			//driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("mum");
			//driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys(Keys.ENTER);
//			WebElement source=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
//			source.clear();
			
			
	}
	
	//@Test
	//RADIO BUTTONS
	public void jobsearchOnAllegisGroupHomePage3() {
		System.out.println("this is my first test4");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		String baseUrl ="http://www.echoecho.com/htmlforms10.htm";
			driver.get(baseUrl);
			
			driver.findElement(By.xpath("//input[@value='Milk']")).click();
			//all the radio buttons size.
		//int count= driver.findElements(By.xpath("//input[@name='group1']")).size();
			//list only 3
			//List<WebElement> countRadioButton = driver.findElements(By.xpath("//input[@name='group1']"));
			//list all 6 elements
			List<WebElement> countRadioButton = driver.findElements(By.xpath("//td[@class='table5']//input[@type='radio']"));
			
			
			
			// countRadioButton.size();
			System.out.println(countRadioButton.size());
			
			//for(int i=0;i<countRadioButton.size();i++) {
		for(int i=0;i<countRadioButton.size();i++) {
				countRadioButton.get(i).click();
				System.out.println(countRadioButton.get(i).getAttribute("value"));
			  //count.get(i);
			
			}
			
			
			
	}
	
	
	//@Test
	//Alerts
	public void jobsearchOnAllegisGroupHomePage6() {
		System.out.println("this is my first test4");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		//String baseUrl ="http://www.tizag.com/javascriptT/javascriptalert.php";
			//driver.get(baseUrl);
			driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

			driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
            // driver.findElement(By.xpath("//form/input[@align='center']")).click();
			System.out.println(driver.switchTo().alert().getText());

			//driver.switchTo().alert().sendKeys("fesfe");

			driver.switchTo().alert().accept(); //Accept = ok done yes

			//driver.switchTo().alert().dismiss();

	}
	
}

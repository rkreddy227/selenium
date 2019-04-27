package Selenium.Selenium;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class AllegisgroupJobSerch2 {

	
	
	@Test
	public void jobsearchOnAllegisGroupHomePage() {
		System.out.println("this is my first test");
		assertTrue(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		String baseUrl = "https://www.spicejet.com/";
			driver.get(baseUrl);
			
		//dropdown
			WebElement checkBoxhyd = driver.findElement(By.cssSelector("input[id*='originStation1_CTXT']"));
	          checkBoxhyd.clear();
             checkBoxhyd.click();
	          driver.findElement(By.xpath("//a[@value='HYD']")).click();
	          driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).click();
//	          
//	          
	       System.out.println(driver.findElement(By.xpath("//a[@value='HYD']")).getText());
	       System.out.println(driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).getText());
//	        
//	   //calender    
	        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
//	   //radiobutton
//	         
	         driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
	       System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).getAttribute("value"));
//	
	   //checkbox with dropdown
	       
	      // driver.findElement(By.xpath("//div[@id='divpaxinfo']")).clear();
	       driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

	       //driver.findElement(By.id("divpaxinfo")).clear();

	       //driver.findElement(By.id("divpaxinfo")).click();
		    

	       
	      WebElement dropElement = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
	                 dropElement.click();
	              
	           for(int i=0;i<5;i++) {
	        	   dropElement.click();
	        	   dropElement.getSize();
	           }
	       driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
	       System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
	
	
	  driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	
	
	
	}
	
	@Test
	//Mouse over
	public void jobsearchOnAllegisGroupHomePage1() {
		System.out.println("this is my first test2");
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		String baseUrl = "https://www.amazon.com/";
			driver.get(baseUrl);
			
			Actions baseAction = new Actions(driver);
			WebElement moveEle = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
			baseAction.moveToElement(moveEle).contextClick().build().perform();
			//baseAction.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		
		    WebElement searchCheckB =driver.findElement(By.cssSelector("input[id*='twotab']"));
		    baseAction.moveToElement(searchCheckB).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
			
	}
	
	@Test
	public void jobsearchOnAllegisGroupHomePage2() {
		System.out.println("this is my first test3");
	}
	
	@Test
	public void jobsearchOnAllegisGroupHomePage3() {
		System.out.println("this is my first test4");
	}
	
}

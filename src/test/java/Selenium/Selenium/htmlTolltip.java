package Selenium.Selenium;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class htmlTolltip {

	@Test
	public static void tmlDownload1(){
		// TODO Auto-generated method stub
		System.out.println("this is my first test");
		assertTrue(true);

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		  driver.get("http://demo.guru99.com/test/tooltip.html");
		  
		  WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
		  
		  String expectedLinktip = "What's new in 3.2";
		  Actions builder = new Actions(driver);
		  builder.clickAndHold().moveToElement(download);
		  builder.moveToElement(download).build().perform();
		  
		  WebElement linkBuild = driver.findElement(By.xpath(".//div[@class='box']/div/a"));
		  System.out.println(linkBuild.getText());
		 // Assert.assertEquals(linkBuild.getText(), expectedLinktip);
		 
		
		/*
		 * driver.get("http://demo.guru99.com/test/tooltip.html"); String
		 * expectedTooltip = "What's new in 3.2"; WebElement download =
		 * driver.findElement(By.xpath(".//*[@id='download_now']")); Actions builder =
		 * new Actions (driver);
		 * 
		 * builder.clickAndHold().moveToElement(download);
		 * builder.moveToElement(download).build().perform();
		 * 
		 * WebElement toolTipElement =
		 * driver.findElement(By.xpath(".//*[@class='box']/div/a")); 
		 * String actualTooltip = toolTipElement.getText();
		 * 
		 * System.out.println("Actual Title of Tool Tip  "+actualTooltip);
		 * if(actualTooltip.equals(expectedTooltip)) {
		 * System.out.println("Test Case Passed"); }
		 */
	
	
	}

}

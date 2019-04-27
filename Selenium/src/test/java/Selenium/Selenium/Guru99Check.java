package Selenium.Selenium;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru99Check {
 
	@Test
	public static void guru99Radio() {
		// TODO Auto-generated method stub

		System.out.println("this is my first test");
		assertTrue(true);

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.get("http://demo.guru99.com/test/radio.html");
		 
		 WebElement radioButton = driver.findElement(By.xpath("//input[@name='webform' and @value ='Option 1']"));
		 radioButton.click();
		 System.out.println(radioButton.isSelected());
		 
		 if (radioButton.isSelected())
		 {
			 System.out.println("Radio button is selected");
			 
		 }
			 else
			 {
				 System.out.println("Radio button is not selected");
				 
		 }
		 List<WebElement> radioChechlist= driver.findElements(By.xpath("//input[@name='webform']"));
		int count=radioChechlist.size();
		//radioChechlist
		 System.out.println(radioChechlist.size());
		 
		 for(int i=0;i<count; i++) {
			 radioChechlist.get(i).click();
			 System.out.println("Elements list  " +radioChechlist.get(i).getAttribute("value"));
		 }
		 		 
	}

}

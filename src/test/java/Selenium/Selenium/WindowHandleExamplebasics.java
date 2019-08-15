package Selenium.Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandleExamplebasics  {

	// https://www.allegisgroup.com
	@Test
	public void jobsearchOnAllegisGroupHomePageBasic() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		String baseUrl = "https://www.allegisgroup.com";
		driver.get(baseUrl);
		
		String windowsHandlesParent= driver.getWindowHandle();

		driver.findElement(By.xpath("//img[contains(@alt,'EASi')]/following-sibling::div//a")).click();

		Set<String> windowsHandles = driver.getWindowHandles();
		System.out.println("open Windows after we click  "+windowsHandles.size());
		Iterator<String> itr = windowsHandles.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			String currentWindowID = itr.next();
			if (currentWindowID!=windowsHandlesParent){
				 
				 //To retrieve the handle of second window, extracting the handle which does not match to first window handle
				 
				String  childWindowID=currentWindowID; //Storing handle of second window handle
				 
				//Switch control to new window
				 
				 driver.switchTo().window(childWindowID);
				 System.out.println(driver.getCurrentUrl());
				 driver.close();
				 driver.switchTo().window(windowsHandlesParent);
				 
		}
			System.out.println(driver.getCurrentUrl());
			//driver.findElement(By.xpath("//img[contains(@alt,'Getting')]/following-sibling::div//a")).click();
			Set<String> windowsHandles3 = driver.getWindowHandles();
			System.out.println(windowsHandles3.size());
			driver.close();

			
		}
		
		

	}

}

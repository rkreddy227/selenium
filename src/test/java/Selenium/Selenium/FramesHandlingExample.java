package Selenium.Selenium;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class FramesHandlingExample {

	
	
	//https://www.allegisgroup.com
	@Test
	public void jobsearchOnAllegisGroupHomePageBasic() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        		
	        String baseUrl = "http://demo.guru99.com/test/guru99home/";					
	        driver.get(baseUrl);
	        
	       // String ParentID= driver.getWindowHandle();
	        driver.switchTo().frame("_mN_main_224278574_0_n");
	        driver.findElement(By.xpath("//a[text()='Data Analytics Training']")).click();

//	        Set<String> allwindows = driver.getWindowHandles();
//	        Iterator<String> itr= allwindows.iterator();
//	        while (itr.hasNext()) {
//				String currentid= itr.next();
//				if(currentid != ParentID) {
//					driver.switchTo().window(currentid);
//					
//				}
//			}
//	        
//	        
	        
	        
	}
	
}

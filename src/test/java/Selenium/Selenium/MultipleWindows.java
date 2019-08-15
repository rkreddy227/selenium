package Selenium.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows {

	@Test
	public void jobsearchOnAllegisGroupHomePageBasic() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.allegisgroup.com";

		//We can use Windowhandles methods and we can swiich between the windows .
		
		//I will get parent window id first 
		String MainWindow=driver.getWindowHandle();		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        while(i1.hasNext())			
        {
            String ChildWindowID=i1.next();		
            if(!MainWindow.equalsIgnoreCase(ChildWindowID))			
            {    		                
                    // Switching to Child window
                    driver.switchTo().window(ChildWindowID);	                                                                                                                      
			// Closing the Child Window.
                        driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);	

	}
}

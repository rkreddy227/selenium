package Selenium.Selenium;



import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sudhaTest {

	@Test
	public  void SpiltString() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();	
        driver.get("https://www.gettinghired.com/en/events");
        Thread.sleep(5000);
        WebElement gotitCookie = driver.findElement(By.xpath("//a[contains(text(),'Got It!')]"));
        gotitCookie.click();
        Thread.sleep(5000);
        
      WebElement checkBoxValue = driver.findElement(By.xpath("//div[@data-value='Employers']//span[@class='score-facet-count']"));
      String test =checkBoxValue.getText();
      System.out.println(checkBoxValue.getText());
      
      //test = test.replaceAll("[\\[\\](){}]","");
      test = test.substring(1,test.length()-1);
      //System.out.println(test);
      
      int number = Integer.parseInt(test);			
  	System.out.println(number);
  
  	
  //	WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox-55e8d42b-72fe-4816-b52e-a463eb3f8a56-0']"));
   //   checkBox.click();
      driver.findElement(By.xpath("//*[@data-id='7faeaf49-e4f6-44f5-9517-eba802c8c77d']")).click();
      Thread.sleep(5000);
     // driver.getTitle();
      WebElement displayH2 =driver.findElement(By.xpath("//div[@class='displaying-results']"));
      String str = displayH2.getText();
     // System.out.println(s.split(",",2));
      //String[] data = s.split(" ", 2);
      //System.out.println("Name :" , + data);
      //System.out.println(str.substring(2,4));
     String split[] = str.split(" "); 
     // for(String s:split) 
      System.out.println(split[1]);
      
    //div[@data-value='Employers']//span[@class='score-facet-count']
      
      
      
      //System.out.println(displayH2.getText());
      //assertTrue(condition);
      driver.quit();
      
	}
	
	public void testEventsPage() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();	
        driver.get("https://www.gettinghired.com/en/events");
        Thread.sleep(2000);	
        
        WebElement checkBoxValue = driver.findElement(By.xpath("//div[@data-value='Employers']//span[@class='score-facet-count']"));
        String test =checkBoxValue.getText();
        test = test.substring(1,test.length()-1);
        int expectedValue = Integer.parseInt(test);			
    	System.out.println(expectedValue);
    	
    	driver.findElement(By.xpath("//*[@data-id='7faeaf49-e4f6-44f5-9517-eba802c8c77d']")).click();
        Thread.sleep(3000);
        
        WebElement displayH2 =driver.findElement(By.xpath("//div[@class='displaying-results']"));
        String str = displayH2.getText();
       String split[] = str.split(" "); 
        System.out.println(split[1]);
        int actualValue=Integer.parseInt(split[1]);
        
        assertTrue(expectedValue==actualValue);
        assertEquals(str, expectedValue);
    	
	}

}

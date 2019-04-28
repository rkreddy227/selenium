package Selenium.Selenium;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class AllegisgroupJobSerch {

	
	
	//https://www.allegisgroup.com
	//@Test
	public void jobsearchOnAllegisGroupHomePageBasic() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        		
	        String baseUrl = "https://www.allegisgroup.com";					
	        driver.get(baseUrl);
	        
	        WebElement keyb = driver.findElement(By.id("keyword-input"));							

	        // Get the WebElement corresponding to the Password Field		
	        WebElement loc1 = driver.findElement(By.id("location-input")); 
	        
	        WebElement jobs= driver.findElement(By.xpath("//button[@class='score-btn js-job-results']"));        
	        WebElement textAdvanceSearch= driver.findElement(By.xpath("//*[@class='acs-advanced-job-search-toggle']"));
	        textAdvanceSearch.click();
	       //dropdown
	        
	        //Select drpComp = new Select(driver.findElement(By.xpath("//*[@class='btn-group js-job-advanced-search-generic'] / button[@data-provider-param='CompanyName']")));
	          //WebElement drpComp = driver.findElement(By.xpath("//*[@class='btn-group js-job-advanced-search-generic']/button[@data-provider-param='CompanyName']"));
	          driver.findElement(By.xpath("//*[@class='btn-group js-job-advanced-search-generic']/button[@data-provider-param='CompanyName']")).click();
	          
	          driver.findElement(By.xpath("//li[@data-value='Aerotek']")).click();
	          
	          
	          
//	        Select drpDistance = new Select(driver.findElement(By.xpath("//*[@data-provider-param='Radius']")));
//            //drpComp.selectByIndex(1);
//            drpDistance.selectByIndex(1);
	        
	        
	      //*[@data-provider-param='Radius']
	        
	        //*[@class='acs-advanced-job-search-toggle']
	        keyb.click();
	        keyb.sendKeys("lead");
	        loc1.click();
	        loc1.sendKeys("maryland");
	        jobs.click();
	        
	        //List<WebElement> elements = driver.findElements(By.xpath("//div[@class='acs-job-feed-item']"));
	        //System.out.println("Number of elements:" +elements.size());

	        List<WebElement> jobTitles = driver.findElements(By.xpath("//*[@class='acs-microcomponent acs-job-title']"));
	        List<WebElement> jobtLocation = driver.findElements(By.xpath("//*[@class='acs-microcomponent acs-job-location']"));

	        //for (int i=0; i<jobTitles.size();i++){
	        	//for(int j=0; j<jobtLocation.size();i++) {
	        	
	        		//System.out.println("JobTitle list :" + jobTitles.get(i).getText());
	        		//System.out.println("JobTitleLocation list :" + jobtLocation.get(i).getText());
	        	//}
	            
	          //}
	       System.out.println(jobTitles.get(0).getText());
	      System.out.println(jobtLocation.get(0).getText());
	        //driver.quit();
	        
	        
	       
	        
	        
	}
	
	@Test
	public void jobsearchOnAllegisGroupHomePageAdvanced() {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        		
	        String baseUrl = "https://www.allegisgroup.com";					
	        driver.get(baseUrl);
	        
	        WebElement keyb = driver.findElement(By.id("keyword-input"));							

	        // Get the WebElement corresponding to the Password Field		
	        WebElement loc1 = driver.findElement(By.id("location-input")); 
	        
	        WebElement jobs= driver.findElement(By.xpath("//button[@class='score-btn js-job-results']"));        
	        WebElement textAdvanceSearch= driver.findElement(By.xpath("//*[@class='acs-advanced-job-search-toggle']"));
	       
	          
	    
	        keyb.click();
	        keyb.sendKeys("lead");
	        loc1.click();
	        loc1.sendKeys("maryland");
	        
	        textAdvanceSearch.click();
		       //dropdown
		        
		        //Select drpComp = new Select(driver.findElement(By.xpath("//*[@class='btn-group js-job-advanced-search-generic'] / button[@data-provider-param='CompanyName']")));
		          WebElement drpComp = driver.findElement(By.xpath("//*[@class='btn-group js-job-advanced-search-generic']/button[@data-provider-param='CompanyName']"));
		          driver.findElement(By.xpath("//*[@class='btn-group js-job-advanced-search-generic']/button[@data-provider-param='CompanyName']")).click();
		          
		          driver.findElement(By.xpath("//li[@data-value='Aerotek']")).click();
		          
		          driver.findElement(By.xpath("//*[@data-provider-param='Radius']")).click();
		          driver.findElement(By.xpath("//li[@data-value='30 mi']")).click();
		          jobs.click();
	        
		      List<WebElement> elementAeroteck = driver.findElements(By.xpath("//img[@src='https://secure.icbdr.com/mediamanagement/zw/myq2tc705psld6g60zw.jpg']"));
		          System.out.println("Number of Aerotech count:"+elementAeroteck.size());
		          
		          
	        //List<WebElement> elements = driver.findElements(By.xpath("//div[@class='acs-job-feed-item']"));
	        //System.out.println("Number of elements:" +elements.size());

	        List<WebElement> jobTitles = driver.findElements(By.xpath("//*[@class='acs-microcomponent acs-job-title']"));
	        List<WebElement> jobtLocation = driver.findElements(By.xpath("//*[@class='acs-microcomponent acs-job-location']"));

	        //for (int i=0; i<jobTitles.size();i++){
	        	//for(int j=0; j<jobtLocation.size();i++) {
	        	
	        		//System.out.println("JobTitle list :" + jobTitles.get(i).getText());
	        		//System.out.println("JobTitleLocation list :" + jobtLocation.get(i).getText());
	        	//}
	            
	          //}
	       //System.out.println(jobTitles.get(0).getText());
	      //System.out.println(jobtLocation.get(0).getText());
	      System.out.println(elementAeroteck.get(0).getText());
	        //driver.quit();
	        
	        
	       
	        
	}
	
}

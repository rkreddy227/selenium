package Selenium.Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReadPOI {

	@DataProvider(name = "samplUrls")
	public Object[][] provideData() throws IOException {
		
		 FileInputStream fis = new FileInputStream("C:\\Users\\18482\\Desktop\\rkexcel.xlsx");
		    
	     XSSFWorkbook workbook = new XSSFWorkbook(fis); 
	    // wb = new HSSFWorkbook(fis);
	     XSSFSheet guru99Sheet = workbook.getSheet("Sheet2");
	     int rowCount = guru99Sheet.getLastRowNum();
	     rowCount = rowCount+1;
	     int ColoumCount = guru99Sheet.getRow(0).getLastCellNum();
	     System.out.println(rowCount);
	     System.out.println(ColoumCount);
	     String[][] tabArray=new String[rowCount][ColoumCount];
	     for (int i = 0; i <rowCount ; i++) {
	         Row row = guru99Sheet.getRow(i);

	         //Create a loop to print cell values in a row
	         for (int j = 0; j < ColoumCount; j++) {
	             //Print Excel data in console
	         		 tabArray[i][j]=row.getCell(j).getStringCellValue();

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	         }}
		return tabArray;
	//return new Object[][] {
//		{"https://www.allegisgroup.com/"}, 
//		{"https://www.allegisgroup.com/en-gb"},
//		{"https://www.allegisgroup.com/en-au"}
		
	//};
	}

	
	@DataProvider(name = "testData")
	public Object[][] provideSearchData() throws IOException {
		
		 FileInputStream fis = new FileInputStream("C:\\Users\\18482\\Desktop\\rkexcel.xlsx");
		    
	     XSSFWorkbook workbook = new XSSFWorkbook(fis); 
	    // wb = new HSSFWorkbook(fis);
	     XSSFSheet guru99Sheet = workbook.getSheet("Sheet3");
	     int rowCount = guru99Sheet.getLastRowNum();
	     rowCount = rowCount+1;
	     int ColoumCount = guru99Sheet.getRow(0).getLastCellNum();
	     System.out.println(rowCount);
	     System.out.println(ColoumCount);
	     String[][] tabArray=new String[rowCount][ColoumCount];
	     for (int i = 0; i <rowCount ; i++) {
	         Row row = guru99Sheet.getRow(i);

	         //Create a loop to print cell values in a row
	         for (int j = 0; j < ColoumCount; j++) {
	             //Print Excel data in console
	         		 tabArray[i][j]=row.getCell(j).getStringCellValue();

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	         }}
		return tabArray;
	}
	//@Test(dataProvider = "samplUrls")
	public void dataprovidersample(String url,String lang) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(url);

		WebElement keyb = driver.findElement(By.id("keyword-input"));
		WebElement loc1 = driver.findElement(By.id("location-input"));

		WebElement jobs = driver.findElement(By.xpath("//button[@class='score-btn js-job-results']"));
		WebElement textAdvanceSearch = driver.findElement(By.xpath("//*[@class='acs-advanced-job-search-toggle']"));
		textAdvanceSearch.click();
		driver.findElement(By.xpath(
				"//*[@class='btn-group js-job-advanced-search-generic']/button[@data-provider-param='CompanyName']"))
				.click();
		driver.findElement(By.xpath("//li[@data-value='Aerotek']")).click();
		keyb.click();
		keyb.sendKeys("lead");
		loc1.click();
		loc1.sendKeys("maryland");
		jobs.click();
		List<WebElement> jobTitles = driver.findElements(By.xpath("//*[@class='acs-microcomponent acs-job-title']"));
		List<WebElement> jobtLocation = driver
				.findElements(By.xpath("//*[@class='acs-microcomponent acs-job-location']"));
		System.out.println(jobTitles.get(0).getText());
		System.out.println(jobtLocation.get(0).getText());

	}

	@Test(dataProvider = "testData")
	public void dataprovidersampleTestdata(String keyword,String location) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.allegisgroup.com/");

		WebElement keyb = driver.findElement(By.id("keyword-input"));
		WebElement loc1 = driver.findElement(By.id("location-input"));

		WebElement jobs = driver.findElement(By.xpath("//button[@class='score-btn js-job-results']"));
		WebElement textAdvanceSearch = driver.findElement(By.xpath("//*[@class='acs-advanced-job-search-toggle']"));
		textAdvanceSearch.click();
		driver.findElement(By.xpath(
				"//*[@class='btn-group js-job-advanced-search-generic']/button[@data-provider-param='CompanyName']"))
				.click();
		driver.findElement(By.xpath("//li[@data-value='Aerotek']")).click();
		keyb.click();
		keyb.sendKeys(keyword);
		loc1.click();
		loc1.sendKeys(location);
		jobs.click();
		List<WebElement> jobTitles = driver.findElements(By.xpath("//*[@class='acs-microcomponent acs-job-title']"));
		List<WebElement> jobtLocation = driver
				.findElements(By.xpath("//*[@class='acs-microcomponent acs-job-location']"));
		System.out.println(jobTitles.get(0).getText());
		System.out.println(jobtLocation.get(0).getText());

	}

	@Test(dataProvider = "socialMedia")
	public void dataprovidersocialMediaTestdata(String keyword,String location) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		WebElement keyb = driver.findElement(By.id("keyword-input"));
		WebElement loc1 = driver.findElement(By.id("location-input"));

		WebElement jobs = driver.findElement(By.xpath("//button[@class='score-btn js-job-results']"));
		WebElement textAdvanceSearch = driver.findElement(By.xpath("//*[@class='acs-advanced-job-search-toggle']"));
		textAdvanceSearch.click();
		driver.findElement(By.xpath(
				"//*[@class='btn-group js-job-advanced-search-generic']/button[@data-provider-param='CompanyName']"))
				.click();
		driver.findElement(By.xpath("//li[@data-value='Aerotek']")).click();
		keyb.click();
		keyb.sendKeys(keyword);
		loc1.click();
		loc1.sendKeys(location);
		jobs.click();
		List<WebElement> jobTitles = driver.findElements(By.xpath("//*[@class='acs-microcomponent acs-job-title']"));
		List<WebElement> jobtLocation = driver
				.findElements(By.xpath("//*[@class='acs-microcomponent acs-job-location']"));
		System.out.println(jobTitles.get(0).getText());
		System.out.println(jobtLocation.get(0).getText());
}
}
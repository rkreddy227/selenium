package Selenium.Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookAccountDataProvider {

	@Test(dataProvider = "facebookAccount")
	public static void FacebookActDataProvider(String ram,String rk,String gmail,String password) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(rk);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(ram);
		driver.findElement(By.xpath("//input[@type='text'and @name='reg_email__']")).sendKeys(gmail);
		driver.findElement(By.xpath("//input[@type='password' and @autocomplete='new-password']")).sendKeys(password);
	    driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	    driver.findElement(By.xpath("//button[@name='websubmit' and @type='submit']")).click();
	
	}
	
	
	@DataProvider(name = "facebookAccount")
	public Object[][] provideSearchData() throws IOException {
		
		 FileInputStream fis = new FileInputStream("C:\\Users\\18482\\Desktop\\rkexcel.xlsx");
		    
	     XSSFWorkbook workbook = new XSSFWorkbook(fis); 
	    // wb = new HSSFWorkbook(fis);
	     XSSFSheet facebooksheet = workbook.getSheet("Sheet5");
	     int rowCount = facebooksheet.getLastRowNum();
	     rowCount = rowCount+1;
	     int ColoumCount = facebooksheet.getRow(0).getLastCellNum();
	     System.out.println(rowCount);
	     System.out.println(ColoumCount);
	     String[][] tabArray=new String[rowCount][ColoumCount];
	     for (int i = 0; i <rowCount ; i++) {
	         Row row = facebooksheet.getRow(i);

	         //Create a loop to print cell values in a row
	         for (int j = 0; j < ColoumCount; j++) {
	             //Print Excel data in console
	         		 tabArray[i][j]=row.getCell(j).getStringCellValue();

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	         }}
		return tabArray;
	}

}

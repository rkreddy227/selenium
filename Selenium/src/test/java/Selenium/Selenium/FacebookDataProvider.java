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

public class FacebookDataProvider {

	@Test(dataProvider = "facebook")
	public static void facebookDataProvider(String gmail,String password) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(gmail);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Login succfull");
		
	}

	@DataProvider(name = "facebook")
	public Object[][] provideSearchData() throws IOException {
		
		 FileInputStream fis = new FileInputStream("C:\\Users\\18482\\Desktop\\rkexcel.xlsx");
		    
	     XSSFWorkbook workbook = new XSSFWorkbook(fis); 
	    // wb = new HSSFWorkbook(fis);
	     XSSFSheet facebooksheet = workbook.getSheet("Sheet4");
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


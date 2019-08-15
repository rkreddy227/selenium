package Selenium.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertiesObj {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties proper = new Properties();
		
	    FileInputStream fisy = new FileInputStream("C:\\Users\\18482\\Selenium\\selenium\\src\\main\\java\\config.properties");
	    proper.load(fisy);
		
		System.out.println(proper.getProperty("name"));
		System.out.println(proper.getProperty("age"));
		
		String url = proper.getProperty("URL");
		System.out.println(url);
		
		String browserName = proper.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("ff")) {
			System.setProperty("webdriver.chrome.driver", "C:\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.get(url);
		
		driver.findElement(By.xpath(proper.getProperty("firstname_xpath"))).sendKeys(proper.getProperty("firstName"));
		driver.findElement(By.xpath(proper.getProperty("lastname_xpath"))).sendKeys(proper.getProperty("lastName"));
        driver.findElement(By.xpath(proper.getProperty("mobilenumber_xpath"))).sendKeys(proper.getProperty("mobileNumber"));
        driver.findElement(By.xpath(proper.getProperty("newpassword_xpath"))).sendKeys(proper.getProperty("newPassword"));
		
		
	}

}

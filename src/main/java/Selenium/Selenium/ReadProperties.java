package Selenium.Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties proper = new Properties();
		
	    FileInputStream fisy = new FileInputStream("C:/Users/18482/Selenium/src/main/java/config.properties");
		
	    proper.load(fisy);
		
		System.out.println(proper.getProperty("name"));
		//System.out.println(prop.getProperty("age"));
		

	}

}

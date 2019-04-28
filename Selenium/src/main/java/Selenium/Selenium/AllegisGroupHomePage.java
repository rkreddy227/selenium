package Selenium.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AllegisGroupHomePage extends BasePage {

	public AllegisGroupHomePage(WebDriver driver) {
		super(driver);
	}

	public void OpenUrl() {
		driver.get("https://www.allegisgroup.com");
	}

	public void clickEasiBrandLink() {
		driver.findElement(By.xpath("//img[contains(@alt,'EASi')]/following-sibling::div//a")).click();

	}

	public String getChildPgeURL() {
		String windowsHandlesParent = driver.getWindowHandle();
		System.out.println(windowsHandlesParent);
		clickEasiBrandLink();
		String childTitle = null;
		Set<String> windowsHandles = driver.getWindowHandles();
		Iterator<String> itr = windowsHandles.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			String currentWindowID = itr.next();
			if (currentWindowID != windowsHandlesParent) {
				String childWindowID = currentWindowID; // Storing handle of second window handle
				driver.switchTo().window(childWindowID);
				 childTitle= driver.getCurrentUrl();
				driver.close();
				driver.switchTo().toString();

			}
		}
		return childTitle;
	}

}

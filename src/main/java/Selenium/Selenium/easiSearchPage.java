package Selenium.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class easiSearchPage extends BasePage{

	public easiSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//div[@class ='displaying-results']/span")
	private WebElement searchPageResultsCount;
	
	@FindBy(xpath="//div[@class='score-tile-grid']/ul/li")
	private List<WebElement> seachPageResultsList;
	
	//div[@class='score-style-box']//a[@class='score-button' and contains( text(),'more')]
	public String getSearchPageList() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return searchPageResultsCount.getText();
		
	}
	
	public int getSearchPageResultList() {
		
		return seachPageResultsList.size();
	}
	
	

}

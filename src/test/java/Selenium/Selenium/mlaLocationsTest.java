package Selenium.Selenium;

import org.testng.annotations.Test;

public class mlaLocationsTest extends BaseTest {
	
	@Test
	public void ValidMlaLocationsPage() {
		
	 mlaHomePage mHomePage = new mlaHomePage(getDriver());
	 mlaLocationsPage mLocationsPage = new mlaLocationsPage(getDriver());
	 
	 
	mHomePage.mlaHomeLocations();
	
	System.out.println(mLocationsPage.mlaLocationsList());
	
	
	
	
	}
	

}

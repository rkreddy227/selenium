package Selenium.Selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class easiContactUs extends BaseTest {
	
	//@Test
	public void ValidateContactUsPage() throws Exception {
		
		easiHomePage eHomePage = new easiHomePage(getDriver());
		ReusableMethods rPage = new ReusableMethods(getDriver());
		contactUsPageEasi eContactPage  = new contactUsPageEasi(getDriver());
		
		//Thread.sleep(5000);
		eHomePage.clickGotit();
		Thread.sleep(2000);
		eHomePage.ClickContactUs();
		assertEquals(rPage.getTitle(), "Contact Us | EASi.com");
		assertEquals(eContactPage.getLocactionsTileSize(),22);
		
	}
	
	
	@Test
	public void ValidateContactUsPageCareersLink() throws Exception {
		
		easiHomePage eHomePage = new easiHomePage(getDriver());
		ReusableMethods rPage = new ReusableMethods(getDriver());
		contactUsPageEasi eContactPage  = new contactUsPageEasi(getDriver());
		
		
		Thread.sleep(5000);
		eHomePage.clickGotit();
		Thread.sleep(2000);
		eHomePage.ClickContactUs();

		
		
		assertEquals(rPage.getTitle(), "Contact Us | EASi.com");
		//careesclick
		eContactPage.CareerContactUs();
		//assertTrue(rPage.getTitle().contains("search"));
		assertTrue(rPage.getTitle().contains("Careers"));
		
	}

}

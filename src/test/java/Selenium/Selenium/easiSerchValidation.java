package Selenium.Selenium;

import org.testng.annotations.Test;

public class easiSerchValidation extends BaseTest {
	

	@Test
	public void validateSeachFunctionaltyInHeader() throws Exception {

		easiHomePage eHomePage = new easiHomePage(getDriver());
		ReusableMethods rPage = new ReusableMethods(getDriver());
		contactUsPageEasi eContactPage  = new contactUsPageEasi(getDriver());
		easiSearchPage searchPage = new easiSearchPage(getDriver());
		
		Thread.sleep(5000);
		eHomePage.clickGotit();
		Thread.sleep(2000);
		eHomePage.clickSearch();
		eHomePage.TextSearch("Testing");
		System.out.println(searchPage.getSearchPageList());
		System.out.println(searchPage.getSearchPageResultList());

		
		
		
	//	eHomePage.
		
		
		
	}

}

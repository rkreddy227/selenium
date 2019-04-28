package Selenium.Selenium;

import org.testng.annotations.Test;

public class guruValidationPage extends BaseTest {

	@Test
	public void validHomePage() {
		guruHomePage gHomePage = new guruHomePage(getDriver());
		guruBankPage gBankPage = new guruBankPage(getDriver());
		
		gHomePage.setUserName("mngr191180");
		gHomePage.setPassword("azApAdA");
		gHomePage.clickloginButton();
		System.out.println(gBankPage.mangeBankPage());	
		
		
	}
}

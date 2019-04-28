package Selenium.Selenium;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class WindowHandleExamplePOM extends BaseTest {

	// https://www.allegisgroup.com
	
   

	@Test
	public void jobsearchOnAllegisGroupHomePageBasic() {
		AllegisGroupHomePage agHomepage = new AllegisGroupHomePage(getDriver());

		agHomepage.OpenUrl();
		String childPageTitle = agHomepage.getChildPgeURL();
		System.out.println(childPageTitle);
		assertTrue(childPageTitle.contains("easi.com"));
	}

}

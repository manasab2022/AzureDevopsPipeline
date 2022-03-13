package com.qa.azuredevops.tests;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenHRMHomePageTest extends BaseTest {
	
	@Test
	public void HRMPageTitleTest()
	{
		String title = homePage.getPagetitle();
		Assert.assertEquals(title, "OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS");
	}
	
	@Test
	public void HRMLogoTest()
	{
		String logo = homePage.logoSrcTest();
		Assert.assertEquals(logo, "https://www.orangehrm.com/themes/orangehrm-modern/static/images/logo.png");
		
	}
	
	
}

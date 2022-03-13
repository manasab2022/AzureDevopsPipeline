package com.qa.azuredevops.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.qa.azuredevops.factory.*;
import com.qa.azuredevops.pages.OpenHRMHome;

public class BaseTest {

	DriverFactor df;
	WebDriver driver;
	OpenHRMHome homePage;

	@BeforeTest
	public void setUp() {
		System.out.println("Inside Before Test Method !!!");
		df = new DriverFactor();
		driver = df.init_driver();
		homePage = new OpenHRMHome(driver);
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Inside After Test Method !!! ");
		driver.quit();
	}

}

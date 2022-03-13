package com.qa.azuredevops.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenHRMHome {
	
	WebDriver driver;
	
	public OpenHRMHome(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getPagetitle()
	{
		return driver.getTitle();
	}
	
	public String logoSrcTest()
	{
		WebElement logo = driver.findElement(By.xpath("//img[@alt='OrangeHRM Inc Logo']"));
		String logoSrc = logo.getAttribute("src");
		return logoSrc;
	}

}

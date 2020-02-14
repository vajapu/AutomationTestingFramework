package com.Selenium.Test.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.Selenium.Test.TestBase;
import com.Selenium.Test.pages.HomePage;

public class HomePageTest extends TestBase{
	
	@Test
	public void testURL() {
		 WebDriver driver = driverManager.getWebDriver();  
		 HomePage homePage = new HomePage(driver);
		 homePage.goTo("https://google.com");
	}
	
	@Test
	public void testURL2() {
		 WebDriver driver = driverManager.getWebDriver();  
		 HomePage homePage = new HomePage(driver);
		 homePage.goTo("https://wikipedia.com");
	}
}

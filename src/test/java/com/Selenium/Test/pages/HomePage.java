package com.Selenium.Test.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void goTo(String url) {
		driver.get(url);
	}
}

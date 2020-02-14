package com.Selenium.Core;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

	@Override
	public void createWebDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/java/resources/drivers/chromedriver");
		DriverManager.setWebDriver(new ChromeDriver());
	}

}

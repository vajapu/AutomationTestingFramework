package com.Selenium.Core;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	private static ThreadLocal<WebDriver> selenium_driver = new ThreadLocal<WebDriver>();

	protected abstract void createWebDriver();

	public static WebDriver getDriver() {
		return selenium_driver.get();
	}

	public static void setWebDriver(WebDriver driver) {
		selenium_driver.set(driver);
	}

	public void quitWebDriver() {
		if (selenium_driver.get() != null) {
			selenium_driver.get().quit();
			selenium_driver.set(null);
		}
	}

	public WebDriver getWebDriver() {
		if (selenium_driver.get() == null) {
			createWebDriver();
		}
		return selenium_driver.get();
	}
}

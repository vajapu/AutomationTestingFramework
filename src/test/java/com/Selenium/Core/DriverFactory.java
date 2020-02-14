package com.Selenium.Core;

public class DriverFactory {

	public static DriverManager getDriverManager(DriverType type) {
		DriverManager driverManager = null;
		switch (type) {
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;

		default:
			break;
		}
		return driverManager;
	}
}

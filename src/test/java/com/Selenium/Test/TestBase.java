package com.Selenium.Test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Selenium.Core.DriverFactory;
import com.Selenium.Core.DriverManager;
import com.Selenium.Core.DriverType;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentEmailReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestBase {
	protected DriverManager driverManager;
	ExtentHtmlReporter extent = new ExtentHtmlReporter("");
	ExtentEmailReporter emailReporter = new ExtentEmailReporter("email.html");
	public static ExtentReports report;
	public ExtentTest test;

	@BeforeMethod
	public void setUp(Method method) {
		String methodName = method.getName();
		driverManager = DriverFactory.getDriverManager(DriverType.CHROME);
		report = new ExtentReports();
	}

	@AfterMethod
	public void handleTestMethodName() {
		driverManager.quitWebDriver();
	}
}

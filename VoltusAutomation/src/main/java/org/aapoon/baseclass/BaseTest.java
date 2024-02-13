package org.aapoon.baseclass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.aapoon.constants.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import com.aapoon.common.utilities.ExtentTestReports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;

public class BaseTest {

	protected static AppiumDriver driver;

	public static Properties properties;
	BufferedReader reader;
	public static ExtentReports extent = ExtentTestReports.extentReportSetup();
	public static ExtentTest extentTest;

	public BaseTest() {

	}
	public static AppiumDriver instance() {

		return driver;

	}

	
}

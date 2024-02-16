package com.aapoon.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aapoon.common.utilities.DriverFactory;
import com.aapoon.common.utilities.IDriverFactory;
import com.aapoon.common.utilities.SeleniumUtilities;
import com.aapoon.common.utilities.IDriverFactory.LocatorType;

import java.net.URL;

import org.aapoon.baseclass.BaseTest;
import org.aapoon.constants.Constants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

@Listeners(com.aapoon.common.utilities.ExtentReportListeners.class)
public class loginTest extends BaseTest {
	SeleniumUtilities seleniumUtilities;

	@BeforeTest
	public void appLaunch() {
		seleniumUtilities = new SeleniumUtilities();
	}

	@Test(priority = 1)
	public void invalidlogin() throws Exception {
		seleniumUtilities.Click("tab bar option menu", LocatorType.id);
		Thread.sleep(3000);
		seleniumUtilities.Click("menu item log in", LocatorType.id);
		extentTest.info("Enter valid username as " + Constants.UserName);
		seleniumUtilities.Click("Username input field", LocatorType.id);
		extentTest.info("User enterd username as " + Constants.UserName);
		extentTest.info("Enter valid Password as " + Constants.Password);
		seleniumUtilities.Click("Password input field", LocatorType.id);
		extentTest.info("User enterd Password as " + Constants.Password);
		extentTest.info("User should cliick on Login Button");
		seleniumUtilities.Click("Login button", LocatorType.id);
		Thread.sleep(5000);
		extentTest.info("User should cliicked on Login Button");

	}

	@Test(priority = 2)
	public void Validlogin() throws Exception {
		Thread.sleep(3000);
		seleniumUtilities.Click("tab bar option menu", LocatorType.id);
		seleniumUtilities.Click("menu item log in", LocatorType.id);
		Thread.sleep(3000);
		extentTest.info("Enter valid username as " + Constants.UserName);
		seleniumUtilities.EnterText("Username input field", LocatorType.id, Constants.UserName);
		extentTest.info("User enterd username as " + Constants.UserName);
		extentTest.info("Enter valid Password as " + Constants.Password);
		seleniumUtilities.EnterText("Password input field", LocatorType.id, Constants.Password);
		extentTest.info("User enterd Password as " + Constants.Password);
		extentTest.info("User should cliick on Login Button");
		seleniumUtilities.Click("Login button", LocatorType.id);
		Thread.sleep(3000);
		extentTest.info("User should cliicked on Login Button");

	}
	
	

}

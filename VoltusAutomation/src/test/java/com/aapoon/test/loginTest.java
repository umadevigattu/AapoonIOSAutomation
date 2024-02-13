package com.aapoon.test;

import org.testng.annotations.Test;

import com.aapoon.common.utilities.DriverFactory;
import com.aapoon.common.utilities.IDriverFactory;
import com.aapoon.common.utilities.SeleniumUtilities;
import com.aapoon.common.utilities.IDriverFactory.LocatorType;

import java.net.URL;

import org.aapoon.baseclass.BaseTest;
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

	@Test
	public void invalidlogin() throws Exception {
		seleniumUtilities.Click("tab bar option menu", LocatorType.id);
		seleniumUtilities.Click("menu item log in", LocatorType.id);
		seleniumUtilities.Click("Username input field", LocatorType.id);
		seleniumUtilities.Click("Password input field", LocatorType.id);
		seleniumUtilities.Click("Login button", LocatorType.id);

		System.out.println("efefesfsef");

	}

	@Test
	public void Validlogin() throws Exception {

		seleniumUtilities.Click("tab bar option menu", LocatorType.id);
		seleniumUtilities.Click("menu item log in", LocatorType.id);
		seleniumUtilities.EnterText("Username input field", LocatorType.id, "bob@example.com");
		seleniumUtilities.EnterText("Password input field", LocatorType.id, "10203040");
		seleniumUtilities.Click("Login button", LocatorType.id);
		System.out.println("vds");

	}

}

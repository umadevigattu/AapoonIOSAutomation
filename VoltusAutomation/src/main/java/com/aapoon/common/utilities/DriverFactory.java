package com.aapoon.common.utilities;

import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class DriverFactory implements IDriverFactory {
	AppiumDriver driver = null;

	public AppiumDriver CreateWebDriver() {
		try {

			XCUITestOptions options = new XCUITestOptions();
			options.setDeviceName("iPhone 14 Pro Max").setPlatformName("16.2")
					.setBundleId("com.saucelabs.mydemoapp.rn");

			driver = new IOSDriver(new URL("http://0.0.0.0:4723"), options);

			return driver;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}
}

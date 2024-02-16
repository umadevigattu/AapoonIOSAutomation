package com.aapoon.common.utilities;

import java.net.URL;

import org.aapoon.constants.Constants;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class DriverFactory implements IDriverFactory {
	AppiumDriver driver = null;

	public AppiumDriver CreateWebDriver() {
		try {

			XCUITestOptions options = new XCUITestOptions();
			options.setDeviceName(Constants.SetDeviceName).setPlatformName(Constants.OSPlatform)
					.setBundleId(Constants.BundilId);

			driver = new IOSDriver(new URL(Constants.AppiumServerUrl), options);

			return driver;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}
}

package com.aapoon.common.utilities;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;

public interface IDriverFactory {

	AppiumDriver CreateWebDriver();

	public enum LocatorType {
		id, name, classname, tagname, xpath, cssselector, linktext, partiallinktext
	}

	
	public enum ListItemInputType {
		value, text, index
	}

	public enum WindowType {
		window, tab
	}
}

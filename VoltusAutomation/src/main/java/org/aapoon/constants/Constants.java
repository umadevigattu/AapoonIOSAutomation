package org.aapoon.constants;

import com.aapoon.common.utilities.CommonUtils;

public class Constants {

	public static final String TestData_Path = System.getProperty("user.dir") + "\\Config\\Configuration.properties";
	
	public static final String TestReportsPath = (System.getProperty("user.dir") + "\\extentReport\\AapoonReports.html");

	/*
	 * public static final String TestReportsPath = (System.getProperty("user.dir")
	 * + "\\extentReport\\WevaReports" + CommonUtils.getCurrentDate() + ".html");
	 */
	public static final String LoginTestData = System.getProperty("user.dir") + "\\InputFiles\\LoginTestData.xlsx";

	public static final int SHORT_WAIT = 3000;
	public static final int MEDIUM_WAIT = 6000;
	public static final int LONG_WAIT = 10000;
	
	public static final String AppiumServerUrl = "http://0.0.0.0:4723";
	public static final String SetDeviceName = "iPhone 14 Pro Max";
	public static final String OSPlatform = "16.2";
	public static final String BundilId = "com.saucelabs.mydemoapp.rn";
	public static final String UserName = "bob@example.com";
	public static final String Password = "10203040";
	
	
	
	

}

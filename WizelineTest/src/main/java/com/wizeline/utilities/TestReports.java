package com.wizeline.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestReports {
	
	public void TestReports() {
		
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	extent.flush();

	}
}

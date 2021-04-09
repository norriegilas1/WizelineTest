package com.wizeline.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserManager {
	
	public static WebDriver driver = null;
	
	@BeforeSuite
	//Open Chrome browser
	public void initialize() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/driver/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	// Test Cleanup
	public void tearDownTest() {
		BrowserManager.driver.quit();
	}
}

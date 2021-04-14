package com.wizeline.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.wizeline.utilities.TestReports;


public class HomePage extends TestReports{
	
	WebDriver driver = null;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locators	
	@FindBy(how = How.CSS, using = "#user-name") WebElement userText;
	@FindBy(how = How.CSS, using = "#password") WebElement pwText;
	
	//Methods
	
	public void loginModal() throws InterruptedException{
		driver.get("https://www.saucedemo.com/");
		//Extent Report
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("Logging In To SauceLabs");
		
		//Functions
		userText.sendKeys("standard_user");  test.pass("Email Accepted");
		pwText.sendKeys("secret_sauce"); test.pass("Password Accepted");
		pwText.sendKeys(Keys.RETURN); test.pass("Able to Login to Facebook");
		Thread.sleep(3000);
		
		extent.flush();
	}
	

}

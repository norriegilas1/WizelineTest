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
	@FindBy(how = How.CSS, using = "#email") WebElement emailText;
	@FindBy(how = How.CSS, using = "#pass") WebElement pwText;
	
	//Methods
	
	public void loginModal() throws InterruptedException{
		driver.get("https://www.facebook.com");
		//Extent Report
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("Logging In To Facebook");
		
		//Functions
		emailText.sendKeys("09183453574");  test.pass("Email Accepted");
		pwText.sendKeys("Iamnumber_010327"); test.pass("Password Accepted");
		pwText.sendKeys(Keys.RETURN); test.pass("Able to Login to Facebook");
		Thread.sleep(3000);
		
		extent.flush();
	}
	
	public void setPass(String text){
	
		pwText.sendKeys();
	
	}

}

package com.wizeline.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.wizeline.pages.CheckoutPage;
import com.wizeline.pages.HomePage;
import com.wizeline.pages.SearchResultsPage;
import com.wizeline.utilities.BrowserManager;

@Test
public class TC_VerifyOrderSuccess extends BrowserManager{
	
	@Test
	public void TCVerifyOrderSuccess() throws InterruptedException {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("Verifying Order Test Scenario");

		HomePage transaction = PageFactory.initElements(driver, HomePage.class);
		SearchResultsPage searchPage = PageFactory.initElements(driver, SearchResultsPage.class);
		CheckoutPage checkoutDetails = PageFactory.initElements(driver, CheckoutPage.class);
		transaction.loginModal(); test.pass("Login Success");
		searchPage.addToCart(); test.pass("Add to Cart Success");
		checkoutDetails.enterCheckoutDetails(); test.pass("Checkout Success");
		
		//Assertion
		SoftAssert softAssertion= new SoftAssert();
		Thread.sleep(3000);
		softAssertion.assertEquals(true, driver.findElement(By.id("checkout_complete_container")).isDisplayed());
		softAssertion.assertAll();
		extent.flush();
	}
	
}

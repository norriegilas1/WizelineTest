package com.wizeline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPage {
WebDriver driver = null;
	
	public CheckoutPage (WebDriver driver) {
		this.driver = driver;
	}
	
	//locators	 
	@FindBy(how = How.CSS, using = "#first-name") WebElement firstName;
	@FindBy(how = How.CSS, using = "#last-name") WebElement lastName;
	@FindBy(how = How.CSS, using = "#postal-code") WebElement postalCode;
	@FindBy(how = How.CSS, using = "#continue") WebElement checkoutButton; 
	@FindBy(how = How.CSS, using = "#finish") WebElement proceedCheckoutButton;
	//Methods
	
	public void enterCheckoutDetails() throws InterruptedException{
		//Functions
		firstName.sendKeys("Norrie"); 
		lastName.sendKeys("Cabrera"); 
		postalCode.sendKeys("4234");
		checkoutButton.click();
		proceedCheckoutButton.click();
		Thread.sleep(2000);
		
	}
}

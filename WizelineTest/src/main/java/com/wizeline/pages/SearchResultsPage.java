package com.wizeline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SearchResultsPage {
	
	WebDriver driver = null;
	
	public SearchResultsPage (WebDriver driver) {
		this.driver = driver;
	}
	
	//locators	
	@FindBy(how = How.XPATH, using = "//*[@class=\"btn btn_primary btn_small btn_inventory\"]") WebElement addToCartButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"shopping_cart_container\"]/a/span") WebElement cartIcon;
	@FindBy(how = How.XPATH, using = "//*[@id=\"checkout\"]") WebElement checkoutIcon;
	//Methods
	
	public void addToCart() throws InterruptedException{
		//Functions
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", addToCartButton);
		cartIcon.click();
		Thread.sleep(3000);
		checkoutIcon.click();
		Thread.sleep(3000);
		
	}
	


}

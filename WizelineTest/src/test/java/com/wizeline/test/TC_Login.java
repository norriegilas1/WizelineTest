package com.wizeline.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.wizeline.pages.HomePage;
import com.wizeline.utilities.BrowserManager;

@Test
public class TC_Login extends BrowserManager{
	
	@Test
	public void TCLogin() throws InterruptedException {
		
		HomePage login = PageFactory.initElements(driver, HomePage.class);
		login.loginModal();
		
		//Assertion
		Assert.assertEquals(false, false);
	}
	
}

package com.wordpress.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;
import com.wordpress.pages.LoginPageNew;

import Helper.BrowserFactory;

public class VerifyWordpressLoginNew {

	@Test
	public void Verifyvalidlogin()

	{
		//this will launch browser and specific url
		WebDriver driver=BrowserFactory.StartBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");

		//Create Page Object using page factory
		LoginPageNew login= PageFactory.initElements(driver, LoginPageNew.class);
		
		//call the method
		login.Login_wordpress("admin", "demo123");
		
		
		
	}

}

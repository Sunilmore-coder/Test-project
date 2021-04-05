package com.wordpress.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

public class VerifyWordpressLogin {

	@Test
	public void Verifyvalidlogin()

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");

		LoginPage login = new LoginPage(driver);

		login.SendUsername("admin");
		login.SendPassword("demo123");
		login.ClickOnLoginButton();

	}

}

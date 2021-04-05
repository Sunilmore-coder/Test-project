/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author ADMIN
 *
 *         This class will Includes all the methods and locators
 */
public class LoginPage {

	WebDriver driver;

	By username = By.id("user_login");
	By password = By.xpath("//input[@id='user_pass']");
	By loginButton = By.name("wp-submit");

	public LoginPage(WebDriver driver)

	{
		this.driver = driver;

	}
	
	public void logintowordpress(String uname, String Pass)
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(Pass);
		driver.findElement(loginButton).click();
	}
	

	public void SendUsername(String Uname) {
		driver.findElement(username).sendKeys(Uname);

	}

	public void SendPassword(String Pass) {

		driver.findElement(password).sendKeys(Pass);
	}

	public void ClickOnLoginButton() {

		driver.findElement(loginButton).click();
	}

}

/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author ADMIN
 *
 *         This class will Includes all the methods and locators
 */
public class LoginPageNew {

	WebDriver driver;
	
	public LoginPageNew(WebDriver localdriver) {
		this.driver=localdriver;
	}
	
	
	@FindBy(id = "user_login")
	@CacheLookup
	WebElement username;	

	@FindBy(how=How.XPATH , using ="//input[@id='user_pass']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.NAME, using="wp-submit")
	@CacheLookup
	WebElement clickonbutton;
	
	
	public void Login_wordpress(String uname, String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		clickonbutton.click();
		
		
	}
	
	
	
}

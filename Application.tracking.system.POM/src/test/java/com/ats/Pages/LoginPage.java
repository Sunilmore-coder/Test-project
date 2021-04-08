/**
 * 
 */
package com.ats.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author ADMIN 
 * this class will store all the locators and methods of login page
 */
public class LoginPage {

	WebDriver driver;

	By Username = By.id("email");
	By Password = By.id("pass");
	By loginbutton = By.name("login");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	/*
	 * public void logintoATS(String Uname, String Pass) {
	 * 
	 * driver.findElement(Username).sendKeys(Uname);
	 * driver.findElement(Username).sendKeys(Pass); }
	 */
	public void typeusername() {

		driver.findElement(Username).sendKeys("manjula@talentrecruit.in");

	}

	public void typepassword() {

		driver.findElement(Password).sendKeys("dummytalent");

	}

	public void loginbutton() {
		driver.findElement(loginbutton).click();

	}

}

/**
 * 
 */
package com.ats.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ats.Pages.LoginPage;

/**
 * @author ADMIN
 *
 */
public class Verifyatslogin {

	@Test
	public void Verifyvalidlogin() {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(
				"https://www.facebook.com/?stype=lo&jlou=AfeeqhsdMThSEj7oNY1ptQ4Qt4PExH6-G_j-TXrOxt5pcUXpPsnXhX_OFG3VPNir2j0-cGpJjwZynQhmWeEQ7Y939trb9h2CLMW5Qp60s_HUaw&smuh=62133&lh=Ac9L6OY0LSx9XHRRNfI");

		LoginPage login = new LoginPage(driver);

		login.typeusername();
		login.typepassword();
		// login.logintoATS("manjula@talentrecruit.in", "dummytalent");
		login.loginbutton();

		driver.quit();

	}

}

package Data_Driven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordpressLogin {

	WebDriver driver;

	@Test(dataProvider = "Wordpressdata")
	public void WordpressLogin(String uname, String password) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demosite.center/wordpress/wp-login.php");

		driver.findElement(By.id("user_login")).sendKeys(uname);

		driver.findElement(By.id("user_pass")).sendKeys(password);

		driver.findElement(By.id("wp-submit")).click();

		// System.out.println(driver.getTitle());
		Thread.sleep(5000);

		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is not able to Log In");

		System.out.println("Page Title is verified- user is able to login");
	}

	@DataProvider(name = "Wordpressdata")
	public Object[][] Passdata() {

		Object[][] data = new Object[3][2];

		data[0][0] = "admin";
		data[0][1] = "123";

		data[1][0] = "admin";
		data[1][1] = "admin";

		data[2][0] = "admin";
		data[2][1] = "demo123";
		
		return data;

	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}

}

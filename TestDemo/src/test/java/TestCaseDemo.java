import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseDemo {

	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}

	@Test
	public void VerifyTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";

		assertEquals(actualTitle, expectedTitle);
//		System.out.println("Page title is : " + driver.getTitle());
	}

	@AfterMethod
	public void Teardown() {
		driver.close();
	}

}

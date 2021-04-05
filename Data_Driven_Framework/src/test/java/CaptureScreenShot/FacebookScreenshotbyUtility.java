package CaptureScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ReadExcelLibrary.Utility;

public class FacebookScreenshotbyUtility {

	@Test
	public void capturescreenshot() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Utility.captureScreenshot(driver, "Browser Started");
		driver.findElement(By.id("email")).sendKeys("sunil more");

		Utility.captureScreenshot(driver, "Type Uname");

		driver.quit();
	}

}

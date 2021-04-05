package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ReadExcelLibrary.Utility;

public class VerifyTitle {

	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;

	@Test
	public void VerifyBlogtitle() {

		report = new ExtentReports("./Report/Title.html");
		logger = report.startTest("Verify Title");
		//report.confdsetTheme(Theme.DARK);

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		logger.log(LogStatus.INFO, "Broswer Started");

		driver.get("http://www.learn-automation.com");

		logger.log(LogStatus.INFO, "App is up and running");
		String Title = driver.getTitle();

		Assert.assertTrue(Title.contains("Google"));
		logger.log(LogStatus.PASS, "Title Verified");
	}

	@AfterMethod
	public void teardown(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE)
			;
		{
			String Screenshotpath = Utility.captureScreenshot(driver, "Browser Started");
			String image = logger.addScreenCapture(Screenshotpath);
			driver.get("./Report/Title.html");
			logger.log(LogStatus.FAIL, "Title Verification failed", image);
		}

		report.endTest(logger);
		report.flush();
		driver.get("./Report/Title.html");
	}

}

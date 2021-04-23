package addnewhire;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JFOtherDetails {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testJFOtherDetails() throws Exception {
		driver.get("https://2p4release3.talentrecruit.com/OnBoarding/OnBoardingCandidate.aspx");
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 |
		// ]]
		driver.findElement(By.xpath("//li[@id='liOther']/a/span/i")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 |
		// ]]
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtAllergicTo")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtAllergicTo")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtAllergicTo")).sendKeys("Nothing");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtMajorill")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtMajorill")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtMajorill")).sendKeys("nothing");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtApplied")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtApplied")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtApplied")).sendKeys("yes, nothing");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtLookFrwrd")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtLookFrwrd")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_txtLookFrwrd")).sendKeys("No. NOthing");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateOtherDetails_btnAddEmergency")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}

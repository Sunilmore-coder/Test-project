package addnewhire;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JFEmergencyContact {
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
	public void testJFEmergencyContact() throws Exception {
		driver.get("https://2p4release3.talentrecruit.com/OnBoarding/OnBoardingCandidate.aspx");
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 |
		// ]]
		driver.findElement(By.id("liLanguage")).click();
		driver.findElement(By.xpath("//li[@id='liEmergency']/a/span/i")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 |
		// ]]
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_btnSave")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtName")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtName")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtName")).sendKeys("Sunil");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtEmailId")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtEmailId")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtEmailId"))
				.sendKeys("Sunilmore@gmail.com");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtContactNo")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtContactNo")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtContactNo"))
				.sendKeys("1234567890");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlRealationship")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlRealationship")))
				.selectByVisibleText("Father");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlRealationship")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlCountry")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlCountry")))
				.selectByVisibleText("India");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlCountry")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlState")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlState")))
				.selectByVisibleText("Maharashtra");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlState")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlCity")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlCity")))
				.selectByVisibleText("Sangli");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_ddlCity")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress1")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress1")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress1")).sendKeys("sangli");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress2")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress2")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress2")).sendKeys("bangalore");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress3")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress3")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress3")).sendKeys("20 h cross");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress4")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress4")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAddress4")).sendKeys("indianagar");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtPinCode")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtPinCode")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtPinCode")).sendKeys("560040");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtTelephoneNumber")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtTelephoneNumber")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtTelephoneNumber"))
				.sendKeys("1234567890");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAdditionalNumber")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAdditionalNumber")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_txtAdditionalNumber"))
				.sendKeys("1234567890");
		driver.findElement(By
				.xpath("//div[@id='ContentPlaceHolder1_ucCandidateEmergencyDetails_pnlEmergency']/div/div[2]/div/div"))
				.click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateEmergencyDetails_btnSave")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
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

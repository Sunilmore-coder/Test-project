package addnewhire;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JFReferanceDetails {
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
	public void testJFReferaranceDetails() throws Exception {
		driver.get("https://2p4release3.talentrecruit.com/OnBoarding/OnBoardingCandidate.aspx");
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 |
		// ]]
		driver.findElement(By.xpath("//li[@id='liReference']/a/span/i")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 |
		// ]]
		driver.findElement(By
				.xpath("//div[@id='ContentPlaceHolder1_ucCandidateReferenceDetails_pnlReference']/div/div[2]/div/div"))
				.click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_btnSave")).click();
		driver.findElement(By.xpath(
				"//div[@id='ContentPlaceHolder1_ucCandidateReferenceDetails_pnlReference']/div/div[2]/div/div/div[2]"))
				.click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtName")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtName")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtName")).sendKeys("Akshay");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtMidName")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtMidName")).sendKeys("Kumar");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtLastName")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtLastName")).sendKeys("Patil");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtDesignation")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtDesignation")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtDesignation"))
				.sendKeys("QA Engineer");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtOrganization")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtOrganization"))
				.sendKeys(Keys.ENTER);
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtDesignation")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtDesignation"))
				.sendKeys("QA Engineer");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtEmailId")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtEmailId")).sendKeys("info@tr.com");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtMobile")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtMobile")).sendKeys("01234567890");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtAddress")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtAddress")).sendKeys("bangalore");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtRelationShip")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtRelationShip")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtRelationShip")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtRelationShip")).sendKeys("Friend");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtEmailId")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtEmailId")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtEmailId"))
				.sendKeys("Akshay@gmail.com");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtMobile")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtMobile")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtMobile")).sendKeys("012345678901");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtExperience")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtExperience")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtExperience")).sendKeys("5");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtAddress")).click();
		driver.findElement(By.xpath("//html")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtAddress")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_txtAddress")).sendKeys("sangli");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateReferenceDetails_btnSave")).click();
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

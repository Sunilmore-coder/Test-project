package addnewhire;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JFLangugageDetails {
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
	public void testJFLangugageDetails() throws Exception {
		driver.get("https://2p4release3.talentrecruit.com/OnBoarding/OnBoardingCandidate.aspx");
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 |
		// ]]
		driver.findElement(By.xpath("//li[@id='liLanguage']/a/span/i")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 |
		// ]]
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage0")).sendKeys("marat");
		driver.findElement(By.id("form1")).submit();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage0")).sendKeys("Marathi");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_ddlProfeciencyLevel0")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_ddlProfeciencyLevel0")))
				.selectByVisibleText("Beginner");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_ddlProfeciencyLevel0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkRead0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkWrite0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkSpeak0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkListen0")).click();
		driver.findElement(By.xpath("//a[@id='tab_language_add_row']/span")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage1")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage1")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage1")).sendKeys("Hindi");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage1")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage1")).sendKeys("Hindi");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_ddlProfeciencyLevel1")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_ddlProfeciencyLevel1")))
				.selectByVisibleText("Proficient");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_ddlProfeciencyLevel1")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkRead1")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkWrite1")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkSpeak1")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkListen1")).click();
		driver.findElement(By.xpath("//a[@id='tab_language_add_row']/span")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage2")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage2")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage2")).sendKeys("English");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage2")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_txtLanguage2")).sendKeys("English");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_ddlProfeciencyLevel2")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_ddlProfeciencyLevel2")))
				.selectByVisibleText("Expert");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_ddlProfeciencyLevel2")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkRead2")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkWrite2")).click();
		driver.findElement(By
				.xpath("//tbody[@id='ContentPlaceHolder1_ucCandidateLanguageDetails_tBodyLanguages']/tr[3]/td[5]/span"))
				.click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkSpeak2")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_chkListen2")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateLanguageDetails_btnSaveSkill")).click();
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

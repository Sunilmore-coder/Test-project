package addnewhire;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JFSkillsDetails {
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
	public void testJFSkillsDetails() throws Exception {
		driver.get("https://2p4release3.talentrecruit.com/OnBoarding/OnBoardingCandidate.aspx");
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 |
		// ]]
		driver.findElement(By.xpath("//li[@id='liSkill']/a/span/i")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 |
		// ]]
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_txtSkillName0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_txtSkillName0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_txtSkillName0")).sendKeys("java");
		driver.findElement(By.id("form1")).submit();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_txtSkillName0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_txtSkillName0")).sendKeys("Java");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_txtVersion0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_txtVersion0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_txtVersion0")).sendKeys("1");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlLastUsed0")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlLastUsed0")))
				.selectByVisibleText("2017");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlLastUsed0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlLastMonth0")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlLastMonth0")))
				.selectByVisibleText("1");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlLastMonth0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlYear0")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlYear0")))
				.selectByVisibleText("1");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlYear0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlMonth0")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlMonth0")))
				.selectByVisibleText("1");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_ddlMonth0")).click();
		driver.findElement(By.xpath("//a[@id='tab_family_add_row']/span")).click();
		driver.findElement(By.id("txtSkillName1")).click();
		driver.findElement(By.id("txtSkillName1")).clear();
		driver.findElement(By.id("txtSkillName1")).sendKeys("TESTING & DR DRILL");
		driver.findElement(By.id("txtSkillName1")).clear();
		driver.findElement(By.id("txtSkillName1")).sendKeys("TESTING & DR DRILL");
		driver.findElement(By.id("txtVersion1")).click();
		driver.findElement(By.id("txtVersion1")).clear();
		driver.findElement(By.id("txtVersion1")).sendKeys("2");
		driver.findElement(By.id("ddlLastUsed1")).click();
		new Select(driver.findElement(By.id("ddlLastUsed1"))).selectByVisibleText("2019");
		driver.findElement(By.id("ddlLastUsed1")).click();
		driver.findElement(By.id("ddlLastMonth1")).click();
		new Select(driver.findElement(By.id("ddlLastMonth1"))).selectByVisibleText("2");
		driver.findElement(By.id("ddlLastMonth1")).click();
		driver.findElement(By.id("ddlYear1")).click();
		new Select(driver.findElement(By.id("ddlYear1"))).selectByVisibleText("3");
		driver.findElement(By.id("ddlYear1")).click();
		driver.findElement(By.id("ddlMonth1")).click();
		new Select(driver.findElement(By.id("ddlMonth1"))).selectByVisibleText("3");
		driver.findElement(By.id("ddlMonth1")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateSkillDetails_btnSaveSkill")).click();
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

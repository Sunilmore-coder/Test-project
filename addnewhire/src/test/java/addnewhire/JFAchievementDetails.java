package addnewhire;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JFAchievementDetails {
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
	public void testJFAchievementDetails() throws Exception {
		driver.get("https://2p4release3.talentrecruit.com/OnBoarding/OnBoardingCandidate.aspx");
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 |
		// ]]
		driver.findElement(By.xpath("//li[@id='liAchievement']/a/span/i")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 |
		// ]]
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtProfAchie0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtProfAchie0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtProfAchie0")).sendKeys("Winner employee of t e yar award");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtOtherAchie0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtOtherAchie0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtOtherAchie0")).sendKeys("1st Prize in Code Vita");
		driver.findElement(By.xpath("//tbody[@id='ContentPlaceHolder1_ucCandidateAchievementDetails_tBodyAchievements']/tr/td[3]")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtStrength0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtStrength0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtStrength0")).sendKeys("Hard Working+");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtWeakness0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtWeakness0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtWeakness0")).sendKeys("Helping Nature");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtHobbie0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtHobbie0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtHobbie0")).sendKeys("Travelling");
		driver.findElement(By.xpath("//tbody[@id='ContentPlaceHolder1_ucCandidateAchievementDetails_tBodyAchievements']/tr/td[6]")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtSports0")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtSports0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_txtSports0")).sendKeys("Cricket");
		driver.findElement(By.id("ContentPlaceHolder1_ucCandidateAchievementDetails_btnAchimnt")).click();
		driver.findElement(By.xpath("//a[@id='tab_family_add_row']/span")).click();
		driver.findElement(By.id("txtProfAchie1")).click();
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

package addnewhire;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JFEducationDetails {
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
	public void testJFEducationDetails() throws Exception {
		driver.get("https://2p4release3.talentrecruit.com/OnBoarding/OnBoardingCandidate.aspx");
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 |
		// ]]
		driver.findElement(By.xpath("//li[@id='liEducation']/a/span/i")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 |
		// ]]
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlEducationCategory")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlEducationCategory")))
				.selectByVisibleText("Secondary(10th)");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlEducationCategory")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtBoard")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtBoard")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtBoard")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtBoard")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtBoard")).sendKeys("maha");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtBoard")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtBoard")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtBoard"))
				.sendKeys("Maharashtra State Board of Secondary and Higher Secondary Education");
		driver.findElement(
				By.xpath("//table[@id='ContentPlaceHolder1_ucCanEducations_rdlEducationType']/tbody/tr/td/label"))
				.click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtStartDate")).click();
		driver.findElement(By.id("past_from_day_0_2")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtStartDate")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtStartDate")).sendKeys("25/02/20");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtEndDate")).click();
		driver.findElement(By.id("past_to_day_3_2")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtEndDate")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtEndDate")).sendKeys("17/03/20");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlYearOfPassing")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlYearOfPassing")))
				.selectByVisibleText("2020");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlYearOfPassing")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlMonthOfPassing")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlMonthOfPassing")))
				.selectByVisibleText("January");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlMonthOfPassing")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlCountry")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlCountry")))
				.selectByVisibleText("India");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlCountry")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlState")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlState")))
				.selectByVisibleText("Karnataka");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlState")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtRollNumber")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtRollNumber")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtRollNumber")).sendKeys("TR87632873");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtMajorSubjects")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtMajorSubjects")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtMajorSubjects")).sendKeys("Mathematics");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlGrade")).click();
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlGrade")))
				.selectByVisibleText("Scale 10 Grading System");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_ddlGrade")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtGrade")).click();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtGrade")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_txtGrade")).sendKeys("10");
		driver.findElement(By.id("ContentPlaceHolder1_ucCanEducations_btnAddCanEducationFields")).click();
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

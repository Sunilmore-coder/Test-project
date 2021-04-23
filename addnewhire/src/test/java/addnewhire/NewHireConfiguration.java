package addnewhire;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewHireConfiguration {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testNewHireConfiguration() throws Exception {

		driver.get("https://2p4.3final.talentrecruit.com/Default.aspx"); // navigate to URL
		driver.findElement(By.id("TR_Header_rptrHeader_lnkMenu_1")).click();// click on My Account
		driver.findElement(By.id("MainContent_txtUserName")).click();
		driver.findElement(By.id("MainContent_txtUserName")).clear();
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("Sunil");// Enter UserName
		driver.findElement(By.id("MainContent_txtPassword")).clear();
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Sunil@123");// Enter Password
		driver.findElement(By.id("MainContent_btnLogin")).click();

		// Handle Alert
		Alert al = driver.switchTo().alert();
		al.accept();

		driver.findElement(By.id("MainContent_LeftPanel_rptrLeftMenu_txtmenuname_13")).click();

		Thread.sleep(30000);
		
		
		driver.findElement(By.id("MainContent_LeftPanel_rptrLeftMenu_rptrLeftMenuInner_13_lnkSubMenu_3")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Control')]"));
				
	//	driver.findElement(By.linkText("control")).click();
		
		
		driver.findElement(By.linkText("General Module")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[15]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[17]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[19]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[21]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[23]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[25]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[27]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[31]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[33]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[35]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[37]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[39]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[43]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[45]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[47]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[49]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[51]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[53]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[55]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[57]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[59]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[61]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[63]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[65]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[67]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[69]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[71]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[73]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[75]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[77]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[79]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[85]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[87]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[89]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[91]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[93]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[95]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[97]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[99]")).click();
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.findElement(By.id("ctl00_ctl00_MainContent_LeftPanel_rptrLeftMenu_ctl05_txtmenuname")).click();
		driver.findElement(By.xpath("//a[@id='MainContent_RightContent_hplAddNew']/em")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 |
		// ]]
		driver.findElement(By.id("ContentPlaceHolder1_txtCandidateName")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txtCandidateName")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_txtCandidateName")).sendKeys("Sunil More");
		driver.findElement(By.xpath("//div[@id='ContentPlaceHolder1_UpdatePanel1']/div[2]")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		// driver.quit();
		System.out.println("Driver is going to quite");
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

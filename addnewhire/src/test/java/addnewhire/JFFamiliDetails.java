package addnewhire;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JFFamiliDetails {
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
  public void testJFFamilyDetails() throws Exception {
    driver.get("https://2p4release3.talentrecruit.com/Recruiter/Requirement.aspx");
    driver.findElement(By.id("MainContent_LeftPanel_rptrLeftMenu_txtmenuname_5")).click();
    driver.findElement(By.xpath("//form[@id='form1']/div[5]/div/section/div[2]/section/div/div/section/header[2]/div/div[2]/div[2]/button")).click();
    driver.findElement(By.id("MainContent_RightContent_lbSortByLastActivity")).click();
    driver.findElement(By.id("MainContent_RightContent_rptrReport_chkbxSelectItem_0")).click();
    driver.findElement(By.xpath("//form[@id='form1']/div[5]/div/section/div[2]/section/div/div/section/header[2]/div/div[2]/div/button")).click();
    driver.findElement(By.id("MainContent_RightContent_hplJoiningForm")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 | ]]
    driver.findElement(By.xpath("//li[@id='liFamily']/a/span/i")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_btnSave")).click();
    driver.findElement(By.xpath("//div[@id='ContentPlaceHolder1_ucCandidateFamilyDetails_pnlFamily']/div/div[3]/div/div/div[5]/div")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ddlRelationShip"))).selectByVisibleText("Son");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtMidName")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtName")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtName")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtName")).sendKeys("Sunil");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtMidName")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtMidName")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtMidName")).sendKeys("Kumar");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtLastName")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtLastName")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtLastName")).sendKeys("Sharma");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ddlRelationShip")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ddlRelationShip"))).selectByVisibleText("Father");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ddlRelationShip")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtMobile")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtMobile")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtMobile")).sendKeys("1234567890");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtOccuption")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtOccuption")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtOccuption")).sendKeys("Engineer");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtEduction")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtEduction")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtEduction")).sendKeys("B.E");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ddlAge")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ddlAge"))).selectByVisibleText("47");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ddlAge")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ddlGender")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ddlGender"))).selectByVisibleText("Male");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ddlGender")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtEduction")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtDOB")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_title")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_title")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_title | ]]
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_prevArrow")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_prevArrow")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_prevArrow | ]]
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_prevArrow")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_year_0_0")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_month_0_0")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_month_0_0 | ]]
    driver.findElement(By.xpath("//tbody[@id='ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_daysBody']/tr/td")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_ceDOB_day_0_0")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtDOB")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtDOB")).sendKeys("27/Dec/1998");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtSchoolInformation")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtSchoolInformation")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtSchoolInformation")).sendKeys("PVPIT Budhgaon");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtPermanentAddressChild")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtPermanentAddressChild")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtPermanentAddressChild")).sendKeys("bangalore");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtPersonalIdentification")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtPersonalIdentification")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_txtPersonalIdentification")).sendKeys("Black Mole on Cheeks");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidateFamilyDetails_btnSave")).click();
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

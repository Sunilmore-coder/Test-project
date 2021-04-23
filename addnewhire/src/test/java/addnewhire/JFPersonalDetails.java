package addnewhire;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JFPersonalDetails {
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
  public void testJFPersonalDetails() throws Exception {
    driver.get("https://2p4release3.talentrecruit.com/");
    driver.findElement(By.id("TR_Header_rptrHeader_lnkMenu_1")).click();
    driver.findElement(By.id("MainContent_LeftPanel_rptrLeftMenu_txtmenuname_5")).click();
    driver.findElement(By.xpath("//form[@id='form1']/div[5]/div/section/div[2]/section/div/div/section/header[2]/div/div[2]/div[2]/button")).click();
    driver.findElement(By.id("MainContent_RightContent_lbSortByProgress")).click();
    driver.findElement(By.xpath("//form[@id='form1']/div[5]/div/section/div[2]/section/div/div/section/header[2]/div/div[2]/div[2]/button")).click();
    driver.findElement(By.id("MainContent_RightContent_lbSortByLastActivity")).click();
    driver.findElement(By.id("MainContent_RightContent_rptrReport_chkbxSelectItem_0")).click();
    driver.findElement(By.xpath("//form[@id='form1']/div[5]/div/section/div[2]/section/div/div/section/header[2]/div/div[2]/div/button")).click();
    driver.findElement(By.id("MainContent_RightContent_hplJoiningForm")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 | ]]
    driver.findElement(By.xpath("//li[@id='liPersonal']/a/span/i")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtECode")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtECode")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtECode")).sendKeys("TR123");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPrefix")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPrefix"))).selectByVisibleText("Mr");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPrefix")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlSuffix")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlSuffix"))).selectByVisibleText("Jr");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlSuffix")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtFirstName")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtFirstName")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtFirstName")).sendKeys("sarathii");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtMiddleName")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtMiddleName")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtMiddleName")).sendKeys("kumari");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtLastName")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtLastName")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtLastName")).sendKeys("Sharmaa");
    driver.findElement(By.xpath("//table[@id='ContentPlaceHolder1_ucCandidatePersonalDetails_ddlSex']/tbody/tr/td[2]/label")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtDob")).click();
    driver.findElement(By.linkText("1")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlMartialStatus")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlMartialStatus"))).selectByVisibleText("Married");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlMartialStatus")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlCountry")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlCountry"))).selectByVisibleText("India");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlCountry")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlState")).click();
    driver.findElement(By.id("MainContent_txtPassword")).click();
    driver.findElement(By.id("MainContent_txtUserName")).clear();
    driver.findElement(By.id("MainContent_txtUserName")).sendKeys("sunil more");
    driver.findElement(By.id("MainContent_txtPassword")).clear();
    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Sunil@123");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlState")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlState"))).selectByVisibleText("Maharashtra");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlState")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlCity")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlCity"))).selectByVisibleText("Satara");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlCity")).click();
    driver.findElement(By.xpath("//div[@id='ContentPlaceHolder1_ucCandidatePersonalDetails_pnlPersonal']/div/div[2]/div[4]/div[13]")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtTotExp")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtTotExp")).sendKeys("4");
    driver.findElement(By.xpath("//div[@id='ContentPlaceHolder1_ucCandidatePersonalDetails_pnlPersonal']/div/div[2]/div[4]")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtRelExp")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtRelExp")).sendKeys("1");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtReligion")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtReligion")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtReligion")).sendKeys("hindu");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtDOA")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ceDOA_day_2_3")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtDOA")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtDOA")).sendKeys("11/03/20");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtAdharCardNo")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtAdharCardNo")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtAdharCardNo")).sendKeys("123456789012");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPANNo")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPANNo")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPANNo")).sendKeys("PPPPP6666P");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPreferredNationality_sl")).click();
    driver.findElement(By.xpath("//li[@id='li_ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPreferredNationality_0']/label")).click();
    driver.findElement(By.xpath("//li[@id='li_ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPreferredNationality_1']/label")).click();
    driver.findElement(By.xpath("//li[@id='li_ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPreferredNationality_2']/label")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPreferredNationality_sl")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_rdbSpeciallyAbled_0")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_chkSpeciallyAbled_0")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_chkSpeciallyAbled_1")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_chkSpeciallyAbled_2")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPrsentAddress1")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPrsentAddress1")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPrsentAddress1")).sendKeys("20 h cross");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPrsentAddress2")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPrsentAddress2")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPrsentAddress2")).sendKeys("indiranagar");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPresentCountry")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPresentCountry"))).selectByVisibleText("India");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPresentCountry")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPresentState")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPresentState"))).selectByVisibleText("Maharashtra");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPresentState")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPresentCity")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPresentCity"))).selectByVisibleText("Mumbai");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPresentCity")).click();
    driver.findElement(By.xpath("//div[@id='ContentPlaceHolder1_ucCandidatePersonalDetails_pnlPersonal']/div/div[2]/div[6]/div[2]/div[6]/div")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPresentPinCode")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPresentPinCode")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPresentPinCode")).sendKeys("5600040");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtFromPresentDate")).click();
    driver.findElement(By.id("past_1_day_2_2")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtFromPresentDate")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtFromPresentDate")).sendKeys("10/03/20");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtToPresentDate")).click();
    driver.findElement(By.id("future_1_day_3_2")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtToPresentDate")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtToPresentDate")).sendKeys("17/03/20");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtTelPresResi")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtTelPresResi")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtTelPresResi")).sendKeys("1234567890");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtTelMobile")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtTelMobile")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtTelMobile")).sendKeys("1234567890");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_chkSameAddress")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtLicence")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtLicence")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtLicence")).sendKeys("KA1234567890123");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtDLFrom")).click();
    driver.findElement(By.id("both_from_3_day_2_2")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtDLFrom")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtDLFrom")).sendKeys("10/03/20");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtDLTo")).click();
    driver.findElement(By.id("both_to_3_day_3_3")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtDLTo")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtDLTo")).sendKeys("18/03/20");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlVehicle")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPassport")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPassport")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtValidFrom")).click();
    driver.findElement(By.id("both_from_1_day_1_3")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtValidFrom")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtValidFrom")).sendKeys("04/03/20");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtValid")).click();
    driver.findElement(By.id("both_to_1_day_5_6")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtValid")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtValid")).sendKeys("04/04/20");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPlaceofBirth")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPlaceofBirth"))).selectByVisibleText("India");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlPlaceofBirth")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPassNo")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPassNo")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtPassNo")).sendKeys("I1234567");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtVisaNo")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtVisaNo")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtVisaNo")).sendKeys("ka123456789");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlVisaType")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlVisaType"))).selectByVisibleText("A1");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlVisaType")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlVisaCountry")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlVisaCountry"))).selectByVisibleText("India");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_ddlVisaCountry")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtVisaFrom")).click();
    driver.findElement(By.id("both_from_2_day_0_3")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtVisaFrom")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtVisaFrom")).sendKeys("26/02/20");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtVisaTo")).click();
    driver.findElement(By.id("both_to_2_day_3_2")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtVisaTo")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_txtVisaTo")).sendKeys("17/03/20");
    driver.findElement(By.id("ContentPlaceHolder1_ucCandidatePersonalDetails_btnAdd")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
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


package addnewhire;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


/*public static void main(String[] args) {
	// TODO Auto-generated method stub
}*/

public class  AddNewHire{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    //driver = new FirefoxDriver();
    driver=new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNewHireManagementAddCandidate() throws Exception {
    driver.get("https://2p4release3.talentrecruit.com/");
    driver.manage().window().maximize();
    driver.findElement(By.id("TR_Header_rptrHeader_lnkMenu_1")).click();
    driver.findElement(By.id("MainContent_txtUserName")).click();
    driver.findElement(By.id("MainContent_txtUserName")).clear();
    driver.findElement(By.id("MainContent_txtUserName")).sendKeys("sunil more");
    driver.findElement(By.id("MainContent_txtPassword")).clear();
    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Sunil@123");
    driver.findElement(By.id("MainContent_btnLogin")).click();
    
    
	Alert al = driver.switchTo().alert();
	al.accept();
    
	//Navigate to NewHire management
	driver.findElement(By.id("MainContent_LeftPanel_rptrLeftMenu_txtmenuname_5")).click();
 	
	Thread.sleep(2000);
	
	// click on Add new Hire Button
    driver.findElement(By.xpath("//a[@id='MainContent_RightContent_hplAddNew']")).click();
   
   // driver.switchTo().frame(2);
    driver.switchTo().frame("GB_frame");
	   
    Thread.sleep(2000);
    
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 | ]]
    
    driver.findElement(By.id("ContentPlaceHolder1_txtCandidateName")).click();		
    
    //driver.findElement(By.id("ContentPlaceHolder1_txtCandidateName")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtCandidateName")).sendKeys("sunil");
    driver.findElement(By.id("ContentPlaceHolder1_txtStudentId")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtStudentId")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtStudentId")).sendKeys("321645498");
    driver.findElement(By.id("ContentPlaceHolder1_rdbGender_1")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtCurrentOrgnisation")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtCurrentOrgnisation")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtCurrentOrgnisation")).sendKeys("A Sharma Associates");
    driver.findElement(By.id("ContentPlaceHolder1_txtCurrentOrgnisation")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtCurrentOrgnisation")).sendKeys("A Sharma Associates");
    driver.findElement(By.id("ContentPlaceHolder1_ddlClient")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlClient"))).selectByVisibleText("Yahoo");
    driver.findElement(By.id("ContentPlaceHolder1_ddlClient")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtCurrentDesignation")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtCurrentDesignation")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtCurrentDesignation")).sendKeys("TR");
    driver.findElement(By.id("ContentPlaceHolder1_txtOverallExp")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtOverallExp")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtOverallExp")).sendKeys("4");
    driver.findElement(By.id("ContentPlaceHolder1_txtYearofExp")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtYearofExp")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtYearofExp")).sendKeys("1");
    driver.findElement(By.id("ContentPlaceHolder1_txtQualification")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtQualification")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtQualification")).sendKeys("B.A (Economics)");
    driver.findElement(By.id("ContentPlaceHolder1_txtQualification")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtQualification")).sendKeys("B.A (Economics)");
    driver.findElement(By.id("ContentPlaceHolder1_txtPrefLoc")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtPrefLoc")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtPrefLoc")).sendKeys("bangalore");
    driver.findElement(By.id("ContentPlaceHolder1_txtCurrentCTC")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtCurrentCTC")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtCurrentCTC")).sendKeys("3");
    driver.findElement(By.id("ContentPlaceHolder1_txtExpectedCTC")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtExpectedCTC")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtExpectedCTC")).sendKeys("4");
    driver.findElement(By.id("ContentPlaceHolder1_txtvariable")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtvariable")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtvariable")).sendKeys("1");
    driver.findElement(By.id("ContentPlaceHolder1_txtFixed")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtFixed")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtFixed")).sendKeys("1");
    driver.findElement(By.id("ContentPlaceHolder1_txtOther")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtOther")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtOther")).sendKeys("1");
    driver.findElement(By.id("ContentPlaceHolder1_txtAge")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtAge")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtAge")).sendKeys("26");
    driver.findElement(By.id("ContentPlaceHolder1_ddlNoticePeriod")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlNoticePeriod"))).selectByVisibleText("Immediate");
    driver.findElement(By.id("ContentPlaceHolder1_ddlNoticePeriod")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ddlCurrency")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlCurrency"))).selectByVisibleText("INR");
    driver.findElement(By.id("ContentPlaceHolder1_ddlCurrency")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ddlPreferredNationality_sl")).click();
    driver.findElement(By.xpath("//li[@id='li_ContentPlaceHolder1_ddlPreferredNationality_0']/label")).click();
    driver.findElement(By.xpath("//li[@id='li_ContentPlaceHolder1_ddlPreferredNationality_1']/label")).click();
    driver.findElement(By.id("caption")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ddlRelocate")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlRelocate"))).selectByVisibleText("Yes");
    driver.findElement(By.id("ContentPlaceHolder1_ddlRelocate")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ddlWorkAuthorization")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlWorkAuthorization"))).selectByVisibleText("US Citizen");
    driver.findElement(By.id("ContentPlaceHolder1_ddlWorkAuthorization")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtPass")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtPass")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtPass")).sendKeys("I12345678");
    driver.findElement(By.id("ContentPlaceHolder1_ddlVisaType")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlVisaType"))).selectByVisibleText("A1");
    driver.findElement(By.id("ContentPlaceHolder1_ddlVisaType")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtRemarks")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtRemarks")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtRemarks")).sendKeys("Na");
    driver.findElement(By.id("ContentPlaceHolder1_txtPANNo")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtPANNo")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtPANNo")).sendKeys("RRRRR6666R");
    driver.findElement(By.id("ContentPlaceHolder1_txtLinkedIn")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtLinkedIn")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtLinkedIn")).sendKeys("www.linkedn.com");
    driver.findElement(By.xpath("(//div[@id='caption'])[2]")).click();
    driver.findElement(By.xpath("//li[@id='li_ContentPlaceHolder1_ddlIndustry_0']/label")).click();
    driver.findElement(By.xpath("//li[@id='li_ContentPlaceHolder1_ddlIndustry_1']/label")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ddlIndustry_sl")).click();
    driver.findElement(By.xpath("(//div[@id='caption'])[3]")).click();
    driver.findElement(By.xpath("//li[@id='li_ContentPlaceHolder1_ddlFunctionalArea_0']/label")).click();
    driver.findElement(By.xpath("//li[@id='li_ContentPlaceHolder1_ddlFunctionalArea_1']/label")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ddlFunctionalArea_sl")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtDOB")).click();
    driver.findElement(By.linkText("1")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtJoiningLocation")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtJoiningLocation")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtJoiningLocation")).sendKeys("bangalore");
    driver.findElement(By.id("ContentPlaceHolder1_txtReportingLocation")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtReportingLocation")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtReportingLocation")).sendKeys("bangaore");
    driver.findElement(By.id("ContentPlaceHolder1_ddlSource")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlSource"))).selectByVisibleText("FresherWorld");
    driver.findElement(By.id("ContentPlaceHolder1_ddlSource")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ddlMaritalStatus")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlMaritalStatus"))).selectByVisibleText("Married");
    driver.findElement(By.id("ContentPlaceHolder1_ddlMaritalStatus")).click();
    driver.findElement(By.id("btn_Next")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).sendKeys("tale.ntrecr.uit.qa@gmail.com");
    driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).sendKeys("9168689566");
    driver.findElement(By.id("ContentPlaceHolder1_txtPhoneNo")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtPhoneNo")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtPhoneNo")).sendKeys("1236547891");
    driver.findElement(By.id("ContentPlaceHolder1_txtAddress")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtAddress")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtAddress")).sendKeys("bangalore");
    driver.findElement(By.id("ContentPlaceHolder1_ddlCountry")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlCountry"))).selectByVisibleText("India");
    driver.findElement(By.id("ContentPlaceHolder1_ddlCountry")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ddlState")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlState"))).selectByVisibleText("Maharashtra");
    driver.findElement(By.id("ContentPlaceHolder1_ddlState")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ddlCity")).click();
    driver.findElement(By.id("ContentPlaceHolder1_ddlCity")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlCity"))).selectByVisibleText("Sangli");
    driver.findElement(By.id("ContentPlaceHolder1_ddlCity")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtLocation")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtLocation")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtLocation")).sendKeys("Sangli");
    driver.findElement(By.id("ContentPlaceHolder1_txtLocation")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtLocation")).sendKeys("Sangli");
    driver.findElement(By.id("btn_Next")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txt1")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txt1")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txt1")).sendKeys("test");
    driver.findElement(By.id("ContentPlaceHolder1_txt2")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txt2")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txt2")).sendKeys("test");
    driver.findElement(By.id("ContentPlaceHolder1_txt3")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txt3")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txt3")).sendKeys("test");
    driver.findElement(By.id("ContentPlaceHolder1_txt4")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txt4")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txt4")).sendKeys("test");
    driver.findElement(By.id("ContentPlaceHolder1_txt5")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txt5")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txt5")).sendKeys("test");
    driver.findElement(By.id("ContentPlaceHolder1_btnAddCandidate")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    driver.findElement(By.xpath("//img[contains(@src,'https://2p4release3.talentrecruit.com/greybox/w_close.png')]")).click();
    driver.findElement(By.xpath("//form[@id='form1']/div[5]/div/section/div[2]/section/div/div/section/header[2]/div/div[2]/div[2]/button")).click();
    driver.findElement(By.id("MainContent_RightContent_lbSortByLastActivity")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
 //   driver.quit();
	  System.out.println("Driver is going to close");
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

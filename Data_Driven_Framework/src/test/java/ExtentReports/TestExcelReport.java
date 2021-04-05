package ExtentReports;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TestExcelReport {

	ExtentHtmlReporter Htmlreport;
	ExtentReports extents;
	ExtentTest test;

	public void setReport() {

		Htmlreport = new ExtentHtmlReporter("./Report/Extentreport.html");
		Htmlreport.config().setEncoding("utf-8");
		Htmlreport.config().setDocumentTitle("Sunil Automation Result");
		Htmlreport.config().setReportName("Automation test result");
		Htmlreport.config().setTheme(Theme.STANDARD);

		extents = new ExtentReports();
		extents.attachReporter(Htmlreport);
		extents.setSystemInfo("Automation Tester", "Sunil more");

		extents.setSystemInfo("Organization", "Talent recruit");

		extents.setSystemInfo("Build Number", "2.4.3");

	}

	@AfterTest
	public void endReport() {
		extents.flush();
	}

	// pass fail skip

	@Test
	public void UserReg() {

		test = extents.createTest("Login Test");
		System.out.println("Executing login test");

		Assert.fail("User registration failed");
	}

	@Test
	public void IsSkipped() {
		test = extents.createTest("Skip Test");
		 throw new SkipException("Skipping Test case");

	}

	

	@AfterMethod
	public void teardown(ITestResult result) {

		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			
		}else if (result.getStatus()==ITestResult.SKIP)
		{
			
			
		}else if (result.getStatus()==ITestResult.SUCCESS)
		{
			String MethodName= result.getMethod().getMethodName();
			
			String logText="<b>" +"Test case:-" +MethodName.toUpperCase()+"PASSED"+"</b>";
			
			Markup m =MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			test.pass(m);
			
		}

	
	
	}	
	
}

package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("testcase is Started and details are " +result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("testcase is failed and details are " +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		
		
		System.out.println("testcase is failed and details are " +result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("testcase is skipped and details are " +result.getName()); 
	}

	
	
}

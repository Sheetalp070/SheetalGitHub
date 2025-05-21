package com.report;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerDemo implements ITestListener {

	
	@Override
    public void onStart(ITestContext context) {
        ExtentReportUtils.setUpReport();  // initialize report
    }
	@Override
	public void onTestStart(ITestResult result) {
		ExtentReportUtils.createTest(result.getMethod().getMethodName());

	}
	
	 @Override
	  public void onTestSuccess(ITestResult result) {
	        try {
				ExtentReportUtils.addStep("✅ Test Passed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	 
	 @Override
	 public void onTestFailure(ITestResult result) {
	        try {
				ExtentReportUtils.addStep("❌ Test Failed: " + result.getThrowable());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	@Override
	public void onFinish(ITestContext context) {
		ExtentReportUtils.flushReport();
	}

	

}
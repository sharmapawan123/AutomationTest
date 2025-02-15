package com.w2a.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.w2a.base.TestBase;

public class ExtentReportManager extends TestBase implements ITestListener  {

	
	public ExtentSparkReporter sparkReporters;
	public ExtentReports extent ;
	public ExtentTest test ;
	
	public void onStart(ITestContext context)
	{ 
		String timeStamp = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		sparkReporters = new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/MyReport"+timeStamp+".html");
		sparkReporters.config().setDocumentTitle("Automation Report");
		sparkReporters.config().setReportName("Regression");
		sparkReporters.config().setTheme(Theme.DARK);

		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporters);
		
		extent.setSystemInfo("Env", "QA");
		extent.setSystemInfo("Browser", "Chrome");
		
		
	}
	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case pass "+ result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Failed "+ result.getName());
		test.log(Status.FAIL, "Test case Failed because"+ result.getThrowable());
		
		String impPath = new TestBase().captureScreenShot(result.getName());
		test.addScreenCaptureFromPath(impPath);
	}
	
	
	 public void onFinish(ITestContext context) {
		 extent.flush();
		  }
	
}

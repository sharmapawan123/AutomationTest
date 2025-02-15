package com.w2a.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	
	public void onStart(ITestContext context) {
		System.out.print("------onStart");
	}

	public void onTestStart(ITestResult result) {
		System.out.print("------onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.print("-------onTestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.print("--------onTestFailure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.print("-----onTestSkipped");
	}

	
	
	 public void onFinish(ITestContext context) {
	    // not implemented
	  }

}

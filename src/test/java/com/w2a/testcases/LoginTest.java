package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.w2a.base.TestBase;

@Listeners(com.w2a.utilities.ExtentReportManager.class)
public class LoginTest extends TestBase {
   
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
		driver.findElement(By.xpath(or.getProperty("banlManager1"))).click();
		Thread.sleep(3000);
		driver.close();
	}
}

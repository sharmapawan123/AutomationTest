package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.w2a.base.TestBase;

public class LoginTest extends TestBase {
   
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
		driver.findElement(By.xpath(or.getProperty("banlManager"))).click();
		Thread.sleep(3000);
	}
}

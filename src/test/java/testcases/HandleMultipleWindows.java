//in this program multiple tabs and multiple windows
//can be handle with a same program

package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
	

@Listeners(com.w2a.listeners.MyListener.class)
public class HandleMultipleWindows {

	@Test(priority = 1)
	public void HandleMultipleWindows() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		System.out.print("Browser is Launched");
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		Thread.sleep(6000);
		String parentWndow = driver.getWindowHandle();
		System.out.println(parentWndow);
		Set<String> allWin = driver.getWindowHandles();
		for (String win : allWin) {
			if (!win.equals(parentWndow)) {
				driver.switchTo().window(win);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parentWndow);
		System.out.print("Navigate to parent window");
		Thread.sleep(2000);
		driver.close();

	}
	
	@Test(priority = 3)
	public void validateTitle()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		System.out.print("Browser is Launched");
		Assert.assertEquals(driver.getTitle(), "Test Title data");
		driver.quit();
		//Pawan also changed in same line 
		
	}

}

package com.w2a.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	/*
	 * these things we gone intitialize in this base class
	 * 
	 * WebDriver, Properties, Logs, ExtentReports ,DB, Excel, Mail,
	 * 
	 */

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static Properties or = new Properties();

	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void setUp() throws IOException {
		if (driver == null) {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			or.load(fis);
			
			if (config.getProperty("browser").equals("firefox"))
			{
				 driver = new FirefoxDriver();
			}else if(config.getProperty("browser").equals("chrome"))
			{
				 driver = new ChromeDriver();
			}
            driver.get(config.getProperty("url"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("impWait"))  ,TimeUnit.SECONDS);
		}
	}

	@AfterSuite
	public void tearDown() {

	}
	
	public String captureScreenShot(String tname)
	{
		
		String timeStamp = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		TakesScreenshot takescreenShot =  (TakesScreenshot) driver;
		File srcfile = takescreenShot.getScreenshotAs(OutputType.FILE);
		String targetFilePath =  System.getProperty("user.dir")+"\\reports\\"+tname+ "_"+timeStamp+ ".png";
		File targetFile = new File(targetFilePath);
		srcfile.renameTo(targetFile);
		return targetFilePath;
		
	}
}

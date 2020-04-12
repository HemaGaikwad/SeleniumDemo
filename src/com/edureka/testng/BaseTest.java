package com.edureka.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest 
{
	public static WebDriver driver=null;
	public static WebDriverWait wait = null;
	
	@Parameters("browserType")
	@BeforeMethod
	public void launchApp(String browser)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Edureka_March_Weekend_2020\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Edureka_March_Weekend_2020\\Selenium\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else 
		{
			Reporter.log("Invalid browser selection");
			System.exit(0);
		}
		
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
	}
	
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}

}

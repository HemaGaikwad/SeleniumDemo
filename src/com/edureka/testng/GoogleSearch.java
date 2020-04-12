package com.edureka.testng;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearch {

	public static WebDriver driver=null;
	public static WebDriverWait wait = null;
	
	//@Parameters({"platform","broswerType"})
	@Test
	public void googleSearch(/*String platform, String broswerType*/) throws MalformedURLException 
	{
		/*String clientUrl ="http://192.168.0.107:4444/wd/hub";
		if(platform =="windows" && broswerType=="Chrome")
		{
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.WIN10);
		}
		else if()
		{
			
		}*/
		String clientUrl ="http://192.168.0.107:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(clientUrl), cap);
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement searchbox =driver.findElement(By.id("fakebox-input"));
		searchbox.sendKeys("selenium");
		searchbox.submit();
		System.out.println(driver.getTitle());

	}

}

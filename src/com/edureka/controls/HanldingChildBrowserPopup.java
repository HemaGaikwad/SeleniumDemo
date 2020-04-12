package com.edureka.controls;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HanldingChildBrowserPopup {

	public static WebDriver driver=null;
	public static WebDriverWait wait = null;
	
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Edureka_March_Weekend_2020\\Selenium\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	wait = new WebDriverWait(driver, 10);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.popuptest.com/");
	
	driver.findElement(By.linkText("Multi-PopUp Test")).click();
	System.out.println();
	String parentwindow = driver.getWindowHandle();
	Set<String> handles = driver.getWindowHandles();
	
	for(String handle: handles)
	{
		if(handle.equals(parentwindow))
		{
			continue;
		}
		else
		{
		driver.switchTo().window(handle);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		}
	}
	}

}

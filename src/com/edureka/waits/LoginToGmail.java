package com.edureka.waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToGmail 
{
	public static WebDriver driver=null;
	public static WebDriverWait wait = null;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Edureka_March_Weekend_2020\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	/*	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		Wait w = new FluentWait(driver).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	*/
		System.out.println();
		driver.get("https://www.gmail.com");
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("seleniumwebpractice@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();	
		driver.findElement(By.name("password")).sendKeys("$Practice456");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		wait.until(ExpectedConditions.titleContains("Inbox"));
		String title = driver.getTitle();
		if(title.contains("Inbox"))
		{
			System.out.println("Login was successful!!");
		}
		else
		{
			System.out.println("Login failed!!!");
		}

	}

}

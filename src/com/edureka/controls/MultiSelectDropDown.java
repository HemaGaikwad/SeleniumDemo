package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiSelectDropDown {

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
		driver.get("file:///C:/Users/Zerobean/Downloads/Sample%20Web%20Page.html?text_name1=&pwd_name1=");
		
		WebElement listBox = driver.findElement(By.id("list2"));
		Select multi = new Select(listBox);
		multi.selectByIndex(2);
		multi.selectByValue("rcr");
		multi.selectByVisibleText("Chennai");
		
		
		multi.deselectByValue("gd");
	}

}

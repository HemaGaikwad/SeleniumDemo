package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DragAndDrop {
	public static WebDriver driver=null;
	public static WebDriverWait wait = null;
	
	@Test
	public void dragAndDrop() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Edureka_March_Weekend_2020\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		//WebElement block2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).perform();
		
		//action.dragAndDrop(block2, dest).perform();;
		
		
		
		

	}

}

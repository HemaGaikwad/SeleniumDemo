package com.edureka.testng;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComposeEmailWithAttachment
{
	

	public static WebDriverWait wait = null;
	public static WebDriver driver=null;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		
	}
	
/*	
	public void runAutoIt() throws IOException
	{
		String strFilePath="C:\\Users\\Zerobean\\Documents\\FilesToUpload\\Sample.txt";
		String strPath="C:\\Edureka_Jan_Weekend_2020\\AttachmentForGmail.exe";
		
		String strParameter =strPath+" "+strFilePath;
		Runtime.getRuntime().exec(strParameter);
	}*/
		
	@Test
	public void composeEmail() throws Exception
	{
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("edurekaseleniumtest");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password@12345$");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		wait.until(ExpectedConditions.titleContains("Inbox"));
		
		WebElement composeBtn = driver.findElement(By.xpath("//div[@gh='cm']"));
		composeBtn.click();		
		
		WebElement attachBtn = driver.findElement(By.xpath("//div[@aria-label='Attach files']/div"));
		attachBtn.click();
		
		
		
		String filePath = "C:\\Users\\Zerobean\\Documents\\FilesToUpload\\mickey.jpg";
		StringSelection sel = new StringSelection(filePath);
		 //Copy the path to the Clip board
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		 // Initialize the object of Robot class and paste the file path which copied
		//and click the Open button by press Enter Key
		
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
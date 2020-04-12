package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {


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
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		/*WebElement infoAlertBtn = driver.findElement(By.xpath("//button[contains(text(),'display an  alert box:')]"));
		infoAlertBtn.click();*/
		
		//Information Alert
/*		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		
		//Confirmation Alert
		WebElement confirmTab = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		confirmTab.click();
		
		WebElement confirmAlertBtn = driver.findElement(By.xpath("//button[contains(text(),' display a confirm box')]"));
		confirmAlertBtn.click();
		
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());	
		//alert.accept();
		alert.dismiss();
		
		WebElement msg = driver.findElement(By.id("demo"));
		System.out.println(msg.getText());*/
	
		//ModalAlert
		
		WebElement modalAlertTab = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		modalAlertTab.click();
		
		WebElement modalAlertBtn = driver.findElement(By.xpath("//button[contains(text(),'demonstrate the prompt box')]"));
		modalAlertBtn.click(); 
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.sendKeys("Ron");
		alert.accept();
		
		WebElement msg = driver.findElement(By.id("demo1"));
		System.out.println(msg.getText());
	}

}

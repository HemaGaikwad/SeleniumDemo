package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOverEvent {

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
		driver.get("https://www.craftsvilla.com/");
		
		/*WebElement sareesLink = driver.findElement(By.xpath("//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']"));
		Actions action = new Actions(driver);
		action.moveToElement(sareesLink).perform();
		
		WebElement georgetteSarees = driver.findElement(By.linkText("Georgette Sarees"));
		georgetteSarees.click();
		
	System.out.println(driver.getTitle());*/

		
		WebElement searcBox =driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		
		Action searchString=action.keyDown(searcBox, Keys.SHIFT).sendKeys("sarees").keyUp(searcBox, Keys.SHIFT).doubleClick(searcBox).build();
		searchString.perform();
		
		Action select = action.keyDown(Keys.CONTROL+"v").build();
		

	}

}

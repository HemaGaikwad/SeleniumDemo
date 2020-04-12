package com.edureka.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginToGmail extends BaseTest
{
	@Parameters({"username","password"})
	@Test(invocationCount=100)
	public void login(String uname, String pwd)
	{
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys(uname);
		driver.findElement(By.xpath("//span[text()='Next']")).click();	
		Assert.fail();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		String exp_title="";
		wait.until(ExpectedConditions.titleContains("Inbox"));
		String title = driver.getTitle();
		
		Assert.assertEquals("", "");
	
	}

}

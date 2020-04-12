package com.edureka.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo
{
	public static WebDriver driver = null;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	/*	WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("your_email@something.com");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("your_password");
		
		WebElement fname = driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
		fname.sendKeys("Hema");   //Exception
*/		
/*		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int size = allLinks.size();
		System.out.println(size);
		
		for(int i =0; i<size; i++)
		{
			WebElement link = allLinks.get(i);
			String text = link.getText();
			System.out.println(text);
		}
		
		System.out.println(allLinks.size());
		for(WebElement link: allLinks)
		{
			String text = link.getText();
			System.out.println(text);
		}*/
		
	//	driver.findElement(By.linkText("Forgotten account?")).click();
		
	//	driver.findElement(By.partialLinkText(" account?")).click();
		
	//	String absXpath = "/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td[1]/input";
		
		/*WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@value='1']"));
		femaleRadioBtn.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("your_email@whatever.com");
		
		WebElement createAcct = driver.findElement(By.xpath("//span[text()='Create an account']"));
		System.out.println(createAcct.getText());
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname' and @aria-label='First name']"));
		fname.sendKeys("Hema");
				
		//input[@name='firstname' or @aria-label='First name' and @id="u_0_m"]
		
		// starts-with and contains -   //tagname[starts-with(@attr ,'partial value')]    , //tagname[starts-with(text(), 'partial text')]
		
		WebElement welcomeMsg = driver.findElement(By.xpath("//div[starts-with(text(),'Facebook helps')]"));
		System.out.println(welcomeMsg.getText());
		
		//div[starts-with(@attr,'partial value')]
		
		WebElement mobile = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		mobile.sendKeys("546878454");
		*/
		
		//xpath - //tagname[@attr='value']    cssSelector - 	tagname[attr='value']
		
		WebElement email = driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
		email.sendKeys("your_email@something.com");
		
	}

}

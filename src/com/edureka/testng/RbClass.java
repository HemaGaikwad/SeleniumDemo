package com.edureka.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class RbClass {
	static {

	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
}
WebDriver driver = new FirefoxDriver();
@Test
public void test1() throws InterruptedException, AWTException{
driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[18]/a")).click();
 Thread.sleep(3000);
 //Clicking on choose-file button will not work because the input type specified
 //is file. Click on the drag-drop box instead
 driver.findElement(By.xpath("//*[@id='drag-drop-upload']")).click();
 //Now Native pop-up will be visible. Robot class will be use to handle the same
 //the selected file on the below given file-path will be uploaded
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
driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();

 //driver.quit();
}
@BeforeMethod
public void startFireFox() {
driver.manage().window().maximize();
driver.get("http://the-internet.herokuapp.com/");
}
}
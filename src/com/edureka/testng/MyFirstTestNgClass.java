package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTestNgClass 
{
	@Test
	public void display()
	{
		Reporter.log("This is the first testng class");
	}

	
}

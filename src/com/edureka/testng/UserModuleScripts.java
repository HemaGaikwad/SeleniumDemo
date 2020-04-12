package com.edureka.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserModuleScripts 
{
	
	@Test(groups= {"Smoke"},priority =1)
	public void createUser()
	{
		Reporter.log("User created successfully!!!");
	
	}

	@Test()
	public void editUser()
	{
		Reporter.log("User details have been edited!!");
	}
	
	@Test()
	public void deleteUser()
	{
		Reporter.log("User deleted!!");
	}
}

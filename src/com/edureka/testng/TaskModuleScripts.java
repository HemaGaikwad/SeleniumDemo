package com.edureka.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModuleScripts 
{
	
	@Test(groups= {"Smoke", "Task"}, priority = 1)
	public void createTask()
	{
		Reporter.log("Task created successfully!!!");
	}

	@Test(groups= {"Task"}, dependsOnMethods="createUser")
	public void editTask()
	{
		Reporter.log("Task details have been edited!!");
	}
	
	@Test(invocationCount=5)
	public void deleteTask()
	{
		Reporter.log("Task deleted!!");
	}
}

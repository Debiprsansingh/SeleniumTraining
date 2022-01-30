package com.project;

import static org.testng.Assert.fail;

import org.apache.log4j.Priority;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestDependency {
	
	
  @Test(priority = 1)
  
  public void orange() {
	  
	  System.out.println("i am orange");
  }
  
  
  @Test(priority = 2,dependsOnMethods = "orange")
  public void white()
  {
	  System.out.println("i am white");
	  //Assert.fail("white is failed");
	  throw new SkipException("white is skipped");
  }
  
  @Test(priority = 4,dependsOnMethods = "blue")
  public void green()
  {
	  System.out.println("i am green");
	 
  }
  
  @Test(priority = 3,dependsOnMethods = "white")
  public void blue()
  {
	  System.out.println("i am blue");
	  
  }
}

package com.project;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class Test1 extends BaseTest{
	
  @Test
  public void f() 
  {
	 // selectOption("facebooksearchtextbox_xpath", projectpath);
	  typeText("facebooksearchtextbox_xpath", "akash");
	  test.log(Status.PASS, "entering the mail id");
	  
  }
  
  
  
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception 
  {
	  
	  initiate();
	  test=report.createTest("Test1");
	  test.log(Status.PASS, "initialising init method");
	  
	  launch(bType);
	  test.log(Status.PASS, "launching browser "+bType);
	  
	  navigateUrl("facebookUrl");
	  test.log(Status.PASS, "navigating to browser"+childprop.getProperty("facebookUrl"));
	  
  }
  
  
  

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
	  report.flush();
	  
  }

}

package com.project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


public class TNG_001 extends BaseTest{
	
	 @BeforeMethod
	 //@Parameters("browser")
	 public void beforemethod() throws Exception
	 {
		 
		 System.out.println("before method in TNG_001");
		 //test= report.createTest("TNG_001");
		 //test.log(Status.PASS, "BeforeMethod in TNG_001");
		 
			 	 
	 }
	 
  @Test
  public void f() {
	  
	  System.out.println("i am akash");
  }
 
  @AfterMethod
  public void aftermethod() 
  {
  System.out.println("after method class");
}
}

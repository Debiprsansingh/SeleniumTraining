package com.project;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TNG_002 extends BaseTest {
  @Test(priority = 3)
  public void f() {
	  System.out.println("f");
  }
  
  @Test(priority = 1)
  public void z() {
	  System.out.println("z");
  }
  
  @Test(priority = 1,enabled = true)
  public void x() {
	  System.out.println("x");
  }
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception 
  {
	  initiate();
	  test.log(Status.PASS, "intialsing");
	  
	  launch(bType);
	  test.log(Status.PASS,"launching browser" );
	  
	  
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
	  report.flush();
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}

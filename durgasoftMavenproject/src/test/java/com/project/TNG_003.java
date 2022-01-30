package com.project;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_003 extends BaseTest
{
	
	
	
  @Test(groups = {"regression","sanity"})
  public void f() 
  {
	 
	 // selectOption("searchamazonDropbox_id", "Books");
		//test.log(Status.PASS, "searching for book options");
		//log.info("selecting the option by taking the value"+ or.getProperty("searchamazonDropbox_id"));
		
		
		typeText("facebooksearchtextbox_xpat", "Harrypotter");
		test.log(Status.PASS, "searching for harry potter book");
		//log.info("searching for the harrypotter books");
	
		//elementClick("amazonsearchButton_id");
		//test.log(Status.PASS, "clicking on search button");
		//log.info("clicking on search button");
	  
  }
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void beforeMethod(String btype) throws Exception 
  {
	  initiate();
		test=report.createTest("TNG_003");
		test.log(Status.INFO, "init properties files");
		//log.info("initialising the init method");
		
		launch(btype);
		
		test.log(Status.PASS, "launching Broswer"+ btype);
		//log.info("launching " +childprop.getProperty("chromebrowser")+" browser");
		
		
		 navigateUrl("facebookUrl");
		test.log(Status.PASS, "launching " +p.getProperty("amazonUrl"));
		//log.info("launching " +p.getProperty("amazonUrl"));
		 	
		
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void afterMethod() {
	  
	 
	  
	  report.flush();
	  driver.quit();
  }

}

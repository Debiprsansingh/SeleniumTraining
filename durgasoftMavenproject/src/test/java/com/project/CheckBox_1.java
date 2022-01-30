package com.project;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class CheckBox_1 extends BaseTest
{
  @Test(groups = {"regression","smoke"})
  public void f() {
	  
	  selectOption("searchamazonDropbox_id", "Books");
		test.log(Status.PASS, "searching for book options");
		//log.info("selecting the option by taking the value"+ or.getProperty("searchamazonDropbox_id"));
		
		
		typeText("amazonsearchtextbox_name", "Harrypotter");
		test.log(Status.PASS, "searching for harry potter book");
		//log.info("searching for the harrypotter books");
	
		elementClick("amazonsearchButton_id");
		test.log(Status.PASS, "clicking on search button");
		//log.info("clicking on search button");
	  
  }
  
  @BeforeMethod(groups = {"regression","smoke"})
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception 
  {
	  initiate();
		test=report.createTest("CheckBox_1");
		test.log(Status.INFO, "init properties files");
		//log.info("initialising the init method");
		
		launch(bType);
		
		test.log(Status.PASS, "launching Broswer"+bType);
		//log.info("launching " +childprop.getProperty("chromebrowser")+" browser");
		
		
		 navigateUrl("amazonUrl");
		test.log(Status.PASS, "launching " +p.getProperty("amazonUrl"));
		//log.info("launching " +p.getProperty("amazonUrl"));
		 	
  }

  @AfterMethod(groups = {"regression","smoke"})
  public void afterMethod() 
  {
	  report.flush();
	  driver.quit();
	  
  }

}

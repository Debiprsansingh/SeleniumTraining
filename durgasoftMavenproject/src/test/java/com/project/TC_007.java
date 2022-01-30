package com.project;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;

public class TC_007 extends BaseTest 
{
	public static final Logger log= Logger.getLogger(TC_007.class);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub4
		initiate();
		test=report.createTest("TC_007");
		test.log(Status.INFO, "init properties files");
		log.info("initialising the init method");
		
		launch("chromebrowser");
		
		test.log(Status.PASS, "launching Broswer");
		log.info("launching" +childprop.getProperty("chromebrowser")+"browser");
		
		
		
		
		navigateUrl("amazonUrl");
		
		test.log(Status.FAIL, "launching " +p.getProperty("chromebrowser")+"broswer");
		log.info("launching the" +p.getProperty("chromebrowser")+"broswer");
		
	
		
		selectOption("searchamazonDropbox_id", "Books");
		test.log(Status.PASS, "searching for book options");
		log.info("selecting the option by taking the value"+ or.getProperty("searchamazonDropbox_id"));
		
		
		typeText("amazonsearchtextbox_name", "Harrypotter");
		test.log(Status.FAIL, "searching for harry potter book");
		log.info("searching for the harrypotter books");
	
		elementClick("amazonsearchButton_id");
		test.log(Status.PASS, "clicking on search button");
		log.info("clicking on search button");
		
		report.flush();
		
		
		
		
		
		
		
		
		
		/*
		 * initiate(); test=report.createTest("TC_007"); test.log(Status.INFO,
		 * "init properties files"); log.info("initialising the init method");
		 * 
		 * launch("chromebrowser");
		 * 
		 * test.log(Status.PASS, "launching Broswer"); log.info("launching "
		 * +childprop.getProperty("chromebrowser")+" browser");
		 * 
		 * 
		 * 
		 * 
		 * navigateUrl("amazonUrl");
		 * 
		 * test.log(Status.PASS, "launching " +p.getProperty("amazonUrl"));
		 * log.info("launching " +p.getProperty("amazonUrl"));
		 * 
		 * getTittle(); test.log(Status.PASS, "getting tittle");
		 * log.info("getting tittle");
		 * 
		 * 
		 * // selectOption("searchamazonDropbox_id", "Books"); test.log(Status.PASS,
		 * "searching for book options"); //
		 * log.info("selecting the option by taking the value "+or.getProperty(
		 * "searchamazonDropbox_id"));
		 * 
		 * enter("searchamazonDropbox_id", "books");
		 */
	
	
		
		
		
		 
		 
		
		 /* 
		 * typeText("amazonsearchtextbox_name", "Harrypotter"); test.log(Status.FAIL,
		 * "searching for harry potter book");
		 * log.info("searching for the harrypotter books");
		 * 
		 * elementClick("amazonsearchButton_id"); test.log(Status.PASS,
		 * "clicking on search button"); log.info("clicking on search button");
		 */
		 
		
		
		
		report.flush();
		

	}

}

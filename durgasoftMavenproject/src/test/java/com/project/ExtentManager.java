package com.project;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends BaseTest{

	public static ExtentHtmlReporter htmlreport;
	
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		if(htmlreport==null)// this is given as we need to run this class at the beginning of the ruuning script so 
							//so that we can get the logs  of every action
		{
		htmlreport= new ExtentHtmlReporter(projectpath +"\\HtmlReports\\report.html" );// to read the path to store the document
		htmlreport.config().setDocumentTitle("automation Report");// document heading
		htmlreport.config().setReportName("Functional Testing Report");
		htmlreport.config().setTheme(Theme.STANDARD);
		
		report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("OS", "windows10");
		report.setSystemInfo("Tester Name", "Akash");
		report.setSystemInfo("Browser", "chrome");
		}
		return report;
		
		
	}
	

}

package com.project;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	public static WebDriver driver;
	public static String projectpath= System.getProperty("user.dir");
	public static FileInputStream fis;
	public static  Properties p;
	public static Properties propmain;
	public static Properties envprop;
	public static Properties childprop;
	public static Properties or;
	public static ExtentReports report;
	public static ExtentTest test;
	public static Logger log;
	public static String filepath;
	
	static
	{
		Date dts= new Date();
		filepath=dts.toString().replace(':', '_').replace(':','_');
		
	}
	
	
	public static void initiate() throws Exception
	{
		fis=new FileInputStream(projectpath+"\\src\\test\\resources\\data.properties");// to read data from properties files
		p= new Properties();
		p.load(fis);
		
		
		/*
		 * fis=new FileInputStream(projectpath+"\\env.properties"); propmain=new
		 * Properties(); propmain.load(fis);
		 */
		
		fis=new FileInputStream(projectpath+"\\src\\test\\resources\\env.properties");// to read the env properties contents
		envprop=new Properties();
		envprop.load(fis);
		String e=envprop.getProperty("env");// taking the env properties value
		System.out.println(e);
		
		
		  fis=new FileInputStream(projectpath + "\\src\\test\\resources\\" +e +".properties"); // enter into the prod properties by taking value from env properties
		  childprop=new Properties();
		  childprop.load(fis); 
			/*
			 * String s=childprop.getProperty("facebookUrl"); System.out.println(s);
			 */
		 
		
		/*
		 * String str=p.getProperty("chromebrowser"); System.out.println(str);
		 */
		  
		  fis =new FileInputStream(projectpath +"\\src\\test\\resources\\or.properties");
		  or=new Properties();
		  or.load(fis);
		  
			
			  fis =new FileInputStream(projectpath + "\\src\\test\\resources\\log4jconfig.properties");
			  PropertyConfigurator.configure(fis);
			 
	report=ExtentManager.getInstance();  
		// we calling here because to initialise 
			 
	}
	
	public static void launch(String browser)
	
	{
		if (browser.equals("chrome"))
		{
			
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", System.getProperty(pr) + "\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("firefox"))
		{	WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\drivers\\geckodriver.exe");
			ProfilesIni p= new ProfilesIni();
			FirefoxProfile name = p.getProfile("seleniumprofile");//loading default browser
			
			FirefoxOptions op=new FirefoxOptions();
			op.setProfile(name);
			
			//notifications  handle
			
			name.setPreference("dom.webnotifications.enabled", false);
			
			
			//for setting untrusted certificates
			
			name.setAssumeUntrustedCertificateIssuer(false);
			name.setAcceptUntrustedCertificates(true);
			
			//proxy setting
			/*
			 * name.setPreference("network.proxy.type", 1);
			 * name.setPreference("network.proxy.socks", "192.168.252.10");// dummy port
			 * number
			 */
			
			//incase firefox doesnt initialized we use the below path 
			//setting binary path 
			//op.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			
			
			driver=new FirefoxDriver(op);
			
		}
	}
	

	public  static void elementClick(String locatorkey) {
		// TODO Auto-generated method stub
		//driver.findElement(By.xpath(orprop.getProperty(locator))).click();
		getElement(locatorkey).click();
		
	}

	public static void typeText(String locatorkey, String text) {
		// TODO Auto-generated method stub
		//driver.findElement(By.name(orprop.getProperty(locator))).sendKeys(text);
		getElement(locatorkey).sendKeys(text);;
		
	}

	public static void selectOption(String locatorkey, String option) {
		// TODO Auto-generated method stub
		// driver.findElement(By.id(orprop.getProperty(locator))).sendKeys(option);
		getElement(locatorkey).sendKeys(option);
	
	}
	
	public static void enter(String locatorkey, String data)
	{
		getElement(locatorkey).sendKeys(data);
	}
	
	
	public static void getTittle()
	{
		String gt = driver.getTitle();
		System.out.println(gt);
	}
	
	

	
	public static WebElement getElement(String locatorkey ) {
		// TODO Auto-generated method stub
		
		
		WebElement element = null;
		//check for element present
		if(!IsElementPresent(locatorkey)) 
			System.out.println("element not found:" + locatorkey);
			//report failure
		
			element=driver.findElement(getLocator(locatorkey));
		
			
		
			/*
			 * if(locatorkey.endsWith("_id"))// as the code is repeated here below we need
			 * to eliminate this eg:by.id {
			 * element=driver.findElement(By.id(or.getProperty(locatorkey))); } else
			 * if(locatorkey.endsWith("_xpath"))// as the code is repeated here below we
			 * need to eliminate this { element=
			 * driver.findElement(By.xpath(or.getProperty(locatorkey)));
			 * 
			 * } else if(locatorkey.endsWith("_tagname")) { element=
			 * driver.findElement(By.tagName(or.getProperty(locatorkey)));
			 * 
			 * } else if(locatorkey.endsWith("_cssselector"))// as the code is repeated here
			 * below we need to eliminate this { element=
			 * driver.findElement(By.cssSelector(or.getProperty(locatorkey)));
			 * 
			 * } else if(locatorkey.endsWith("_classname"))// as the code is repeated here
			 * below we need to eliminate this { element=
			 * driver.findElement(By.className(or.getProperty(locatorkey)));
			 * 
			 * } else if(locatorkey.endsWith("_name")) { element=
			 * driver.findElement(By.name(or.getProperty(locatorkey)));
			 * 
			 * } 
			 */
			return element;
	}
		public static boolean IsElementPresent(String locatorkey) {
		// TODO Auto-generated method stub
		System.out.println("check for element present");
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			if (locatorkey.endsWith("_id"))
			{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(or.getProperty(locatorkey))));
			}
			else if (locatorkey.endsWith("_xpath"))
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(or.getProperty(locatorkey))));
			}
			else if (locatorkey.endsWith("_tagname"))
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(or.getProperty(locatorkey))));
			}
			else if (locatorkey.endsWith("_cssselector"))
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(or.getProperty(locatorkey))));
			}
			else if (locatorkey.endsWith("_classname"))
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.className(or.getProperty(locatorkey))));
			}
			else if (locatorkey.endsWith("_name"))
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name(or.getProperty(locatorkey))));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		
		return true;
	}
		public static By getLocator(String locatorkey )
		{
			By by=null;
			if(locatorkey.endsWith("_id"))
			{
				by=By.id(or.getProperty(locatorkey));
			}
			else if (locatorkey.endsWith("_tagname"))
			{
				by=By.tagName(or.getProperty(locatorkey));
				
			}
			else if (locatorkey.endsWith("_classname"))
			{
				by=By.className(or.getProperty(locatorkey));
				
			}
			else if (locatorkey.endsWith("_cssselector"))
			{
				by=By.cssSelector(or.getProperty(locatorkey));
				
			}
			else if (locatorkey.endsWith("_xpath"))
			{
				by=By.xpath(or.getProperty(locatorkey));
				
			}
			else if (locatorkey.endsWith("_name"))
			{
				by=By.name(or.getProperty(locatorkey));
				
			}
			
			
			
			
			return by;
			
		}

		public static void navigateUrl(String url) 
		
		{
			
			//driver.get(childprop.getProperty(url));
			driver.navigate().to(childprop.getProperty(url));
		
	}
		public static boolean islinkEqual(String expectedlinks) {
			// TODO Auto-generated method stub
		String actuallink = driver.findElement(By.linkText("Customer Service")).getText();
			
			if (actuallink.equals(expectedlinks))
				return true;
			
			else
			return false;

}
		
	//***************r reportings *******************
		
		public static void reportsuccess(String successMsg) throws IOException {
			// TODO Auto-generated method stub
			test.log(Status.PASS, successMsg);
			takesScreenShot();
			 
					
		}

		public static void reportfailure(String failureMsg) throws IOException {
			// TODO Auto-generated method stub
			test.log(Status.FAIL, failureMsg);
			
		}

		public static void takesScreenShot() throws IOException {
			Date dt=new Date();
			String d= dt.toString().replace(':', '_').replace(':', '_')+".png";
			File scrsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scrsht, new File(projectpath+"//failurescreenshot//"+d ));
			
			test.log(Status.INFO, "screenshot----->" + test.addScreenCaptureFromPath(projectpath+"//failurescreenshot//"+d));
		}
		
		
		public void waitForElement(WebElement locator, int timeOutinSeconds,String typeofAction)
		{
			WebDriverWait wait= new WebDriverWait(driver,timeOutinSeconds);
			
			if(typeofAction.equals("elementClickeble"))
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			
			else if(typeofAction.endsWith("elementVisible"))
			wait.until(ExpectedConditions.visibilityOf(locator)); 
		}
		
}




package pageObjectModel;

import org.testng.annotations.Test;

import com.project.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class POM_001 extends BaseTest {
	
	//WebDriver driver;
  @Test
  public void f() 
  {
	  LoginPage page= new LoginPage(driver);
	  page.CustomerLogin();
	  
	 Assert.assertEquals(page.verifyuser(),"Authentication failed." );
	  
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  
	  
	 
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
	  
  }

}

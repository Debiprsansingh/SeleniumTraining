package switches;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class javaScript_alert {
	
	WebDriver driver;
	
  @Test
  public void f() 
  {
	  driver.findElement(By.name("cusid")).sendKeys("akash");
	  driver.findElement(By.name("submit")).click();
	  
	  Alert al = driver.switchTo().alert();
	   String expval = al.getText();
	  Assert.assertEquals(expval, "Do you really want to delete this Customer?");
	  al.accept();
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/selenium/delete_customer.php");
	  
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

}

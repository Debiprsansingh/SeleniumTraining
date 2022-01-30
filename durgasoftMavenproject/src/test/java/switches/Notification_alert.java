package switches;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class Notification_alert {
	WebDriver driver; 
	
  @Test
  public void f() {
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions option= new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  
	  driver= new ChromeDriver(option);
	  driver.manage().window().maximize();
	  driver.get("https://whatmylocation.com/");
	  Thread.sleep(3000);
	 // driver.findElement(By.id("mic-launcher")).click();
	 
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}

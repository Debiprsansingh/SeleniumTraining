package switches;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class HtmlSwitchalert {
	WebDriver driver;
  @Test
  public void f() 
  {

	  driver.findElement(By.id("webcam-launcher")).click();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions option= new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  
	  driver=new ChromeDriver(option);
	  driver.manage().window().maximize();
	  driver.get("https://webcamtests.com/check");
	  
	  Thread.sleep(3000);
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}

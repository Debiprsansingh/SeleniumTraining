package excelDataDriven;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDemoByUsingDataProvider {
WebDriver driver ; 
	
	@BeforeMethod
	public void startup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	
	@Test(dataProvider = "getData")
	public void fbTest(Hashtable<String, String> str)
	{
		if(!str.get("RunMode").equals("N"))
		{
			driver.findElement(By.id("email")).sendKeys(str.get("UserName"));
			driver.findElement(By.id("pass")).sendKeys(str.get("UserPassword"));
		}
	}
	
	@DataProvider
	public Object[][] getData() throws Exception
	{
		ExcelAPI e = new ExcelAPI("C:\\Users\\91828\\OneDrive\\Documents\\suitex.xlsx");
		String sheetName = "data";
		String testCaseName = "loginTest";
		
		return DataUtils.getTestData(e, sheetName, testCaseName);
}
}

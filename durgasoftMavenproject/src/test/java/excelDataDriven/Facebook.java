package excelDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		ExcelAPI e2= new ExcelAPI("C:\\Users\\91828\\OneDrive\\Documents\\Book1.xlsx");
		
		for(int i=1;i<e2.getRowCount("login");i++)
		{
			
			driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("email")).sendKeys(e2.getCellData("login", "Username", i));
		
		driver.findElement(By.id("pass")).clear();

		driver.findElement(By.id("pass")).sendKeys(e2.getCellData("login", "Password", i));
		
		}
		

	}

}

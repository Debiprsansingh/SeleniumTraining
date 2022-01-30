package switches;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitching2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://icicibank.com");
		option.addArguments("--disable-notificatons");
		System.out.println(driver.getTitle());
		String parentid= driver.getWindowHandle();
		System.out.println(parentid);
		
		
		
		driver.findElement(By.xpath("//h6[contains(text(),'Home Loan')]")).click();
		
		Set<String> ids= driver.getWindowHandles();
		for (String window:ids)
		{
			if (!parentid.equals(window))
			{
				driver.switchTo().window(window);
			}
		}
		

	}

}

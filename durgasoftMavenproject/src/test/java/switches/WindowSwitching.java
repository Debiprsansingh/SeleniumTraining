package switches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--incognito");//to get incognito 
		
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);// works only on selenium 4 
		
		driver.get("https://amazon.com");
		System.out.println(driver.getTitle());
		
	
	}

}

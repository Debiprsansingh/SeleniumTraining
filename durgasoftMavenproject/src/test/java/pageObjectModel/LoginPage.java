package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.BaseTest;

public class LoginPage extends BaseTest

{
	//WebDriver driver;
	
	
	@FindBy(linkText = "Sign in") public WebElement signin;
	
	@FindBy(id="email") public WebElement userEmail;
	
	@FindBy(id="passwd")public WebElement userPassword;
	
	@FindBy(id="SubmitLogin") public WebElement submitlogin;
	
	@FindBy(xpath = "//li[contains(text(),'Authentication failed.')]") public WebElement userauth;
	
	
	
	
	public LoginPage(WebDriver driver) 
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void CustomerLogin()
	{
		signin.click();
		
		userEmail.sendKeys("singhprasandebi123@gmail.com");
		
		//WebDriverWait wait= new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(submitlogin));
		
		waitForElement(submitlogin,30,"elemenetClickable");
		
		
		userPassword.sendKeys("12345");
		submitlogin.click();
	}
	
	

	public String verifyuser()
	{
		return userauth.getText();
		
		
	}
	
	
	
	
}

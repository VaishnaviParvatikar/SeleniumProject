package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver1)
	{
		driver = driver1;
	}
	
	By button = By.xpath("//a[contains(text(),'orange HRM')]");
	By un = By.name("username");
	By pwd = By.name("password");
	By log = By.xpath("//button[@type='submit']");
	

	public void login() throws InterruptedException
	{
		driver.findElement(button).click();
		Thread.sleep(3000);		
		driver.findElement(un).sendKeys("Admin");
		driver.findElement(pwd).sendKeys("admin123");		
		driver.findElement(log).click();
		
	}	
}

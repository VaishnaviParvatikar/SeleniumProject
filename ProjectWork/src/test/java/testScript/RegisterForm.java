package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterForm 
{
WebDriver driver;
	
	public RegisterForm(WebDriver driver1)
	{
		driver = driver1;
	}

	public void register() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vaishnavi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9875468866");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='female']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@id='country']")).sendKeys("Australia");
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	        Thread.sleep(3000);
	       // driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/table[1]")).click();
	        driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
	        Thread.sleep(3000);
	       WebElement f1 = driver.findElement(By.xpath("//iframe[@id='frame-one796456169']"));
	        driver.switchTo().frame(f1);
	        driver.findElement(By.name("Submit")).click();
	}
}

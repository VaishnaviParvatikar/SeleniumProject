package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownAndAlert 
{
WebDriver driver;
	
	public DropdownAndAlert(WebDriver driver1)
	{
		driver = driver1;
	}
	
	public void dropdown() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,400)", "");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//select[@id='country']")).click();
		  driver.findElement(By.xpath("//option[contains(text(),'India')]")).click();
		  Thread.sleep(3000);
	}
	public void alert1() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
	}
	
	public void aler2() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[contains(text(),'Confirm Box')]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
	
	
	public void alert3() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Vaishnavi");
		alert.accept();
		
		Thread.sleep(3000);
		
		WebElement displayMessage = driver.findElement(By.xpath("//p[@id='demo']"));	 
	     String getText = displayMessage.getText(); 
	     System.out.println(getText); 
		
		
	}
}

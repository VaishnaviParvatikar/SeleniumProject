package testScript;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesAndWindows 
{
WebDriver driver;
	
	public FramesAndWindows(WebDriver driver1)
	{
		driver = driver1;
	}
	
	public void window1() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();
		Thread.sleep(3000);
		ArrayList<String> win = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(win.get(1));
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.switchTo().window(win.get(0));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	
		
	}
	
	public void frames1() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)", "");
		  Thread.sleep(3000);
		WebElement frame =driver.findElement(By.xpath("//iframe[@id='frame-one796456169']"));
		driver.switchTo().frame(frame);
		//name
		driver.findElement(By.name("RESULT_TextField-0")).sendKeys("vaish");
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		//dob
		driver.findElement(By.name("RESULT_TextField-2"));	
		driver.findElement(By.className("icon_calendar")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.className("ui-state-default")).click();
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[contains(text(),'1998')]")).click();
		
	
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//tr//td/a[contains(text(),'14')]")).click();
		//driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[contains(text(),'August')]")).click();
		
		Thread.sleep(3000);
		
		//job
		WebElement el1 = driver.findElement(By.className("drop_down"));
		el1.click();
		Thread.sleep(3000);
		el1.sendKeys("QA Engineer");
		el1.click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("Submit")).click();
	}

}

package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Draggable_resizable_selectable 
{
WebDriver driver;
	
	public Draggable_resizable_selectable(WebDriver driver1)
	{
		driver = driver1;
	}
	
	public void drag() throws InterruptedException
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,400)", "");
		  Thread.sleep(3000);
		  
	
		Actions action = new Actions(driver);
		
		WebElement ele1 = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		action.dragAndDropBy(ele1, 80, 90).perform();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		
		
		  
	}
	
   	public void resizable()throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)", "");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//body//div[@class='column-right-inner']"));
		  
		  WebElement ele =driver.findElement(By.xpath("//body//div[@class='ui-resizable-handle ui-resizable-e']"));
		  Actions action = new Actions(driver);
		  Thread.sleep(3000);
		action.moveToElement(ele);
		  action.clickAndHold(ele).moveByOffset(200, 200).build().perform();
		  Thread.sleep(3000);
		 
		  
		  
	}
	
	
	public void Selectables() throws InterruptedException
	{   
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)", "");
		  Thread.sleep(3000);   
		  
		  driver.findElement(By.xpath("//div[@id='HTML8']"));
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//tbody/tr[1]/td[4]"));
		  driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		  Thread.sleep(3000);
		  
	}
	
}

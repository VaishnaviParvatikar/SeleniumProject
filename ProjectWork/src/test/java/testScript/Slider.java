package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slider 
{
WebDriver driver;
	
	public Slider(WebDriver driver1)
	{
		driver = driver1;
	}
	
	//By button = By.xpath("//div[@id='slider']");
	
	public void move() throws InterruptedException
	{
		
		WebElement slider = driver.findElement(By.xpath("//body//div//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
        Actions action = new Actions(driver);
        action.click(slider).build().perform();
        Thread.sleep(1000);
        for (int i = 0; i < 10; i++) 
        {
            action.sendKeys(Keys.ARROW_RIGHT).build().perform();
            Thread.sleep(200);
        }

       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
    
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/table[1]")).click();
        
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5000));
        //)
        
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("java");
        Thread.sleep(3000);
       // driver.findElement(By.xpath("//body//div[@class='wikipedia-searchtable']//span//input[@class='wikipedia-search-button']")).click();
        driver.findElement(By.className("wikipedia-search-button")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.linkText("Java")).click();
        Thread.sleep(3000);
		
	}
}

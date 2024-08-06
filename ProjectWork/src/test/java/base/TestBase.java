package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase 

{
	WebDriver driver;

	
	 public void suiteSetup() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Apache POI jars\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.setBinary("C:\\Apache POI jars\\chrome\\chrome-win64\\chrome-win64\\chrome.exe");
			WebDriver driver = new ChromeDriver();
			 driver.get("https://testautomationpractice.blogspot.com/");
			 driver.manage().window().maximize();
			// Thread.sleep(3000);
	 }
	 
	 
			 @AfterSuite
			    public void suiteTearDown() {
			    	driver.quit();
			    }
			  
			  
}

	


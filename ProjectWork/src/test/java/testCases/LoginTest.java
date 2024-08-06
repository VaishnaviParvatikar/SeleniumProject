package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import testScript.Draggable_resizable_selectable;
import testScript.DropdownAndAlert;
import testScript.FramesAndWindows;
import testScript.LoginPage;
import testScript.RegisterForm;
import testScript.Slider;

//import testScript.LoginPage;


public class LoginTest {
	WebDriver driver;
	    
	 @BeforeMethod
	  public void launch() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Apache POI jars\\chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.setBinary("C:\\Apache POI jars\\chrome\\chrome-win64\\chrome-win64\\chrome.exe");
			 driver = new ChromeDriver();
			 driver.get("https://testautomationpractice.blogspot.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(3000);
	  }
	  
	
	/*@BeforeMethod
	 public void suiteSetup1() 
	{
		
		TestBase t1 = new TestBase();
		t1.suiteSetup();
	}
	*/
	
	/*  @Test
	  public void Vlogin() throws InterruptedException 
	  {
		  LoginPage L1 = new LoginPage(driver);
		  
		  L1.login();
		  
	  }
	  
	 */
	 
	/*  @Test
	  public void slider1() throws InterruptedException 
	  {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,500)", "");
		  Slider s1 = new Slider(driver);
		  Thread.sleep(3000);
		  JavascriptExecutor js1 = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,100)", "");
		  Slider s11 = new Slider(driver);
		  
		 s1.move();
		 
		  
	  }
	  
	  */
	 
	 
	/*  @Test
	  public void dragg1() throws InterruptedException
	  {
		  Draggable_resizable_selectable s12 = new Draggable_resizable_selectable(driver);
		  s12.drag();
		  s12.resizable();
		  s12.Selectables();
	  }
	  
	 */ 
	 
	 
	/* @Test
	 public void regsiter1() throws InterruptedException
	 {
		 RegisterForm r11 = new RegisterForm(driver);
		 r11.register();
	 }
	  
	 */
	 
	 @Test
	 public void win() throws InterruptedException
	 {
		 FramesAndWindows w1 = new FramesAndWindows(driver);
		// w1.window1();
		 w1.frames1();
	 }
	 
	 
	 
	 
	/* @Test
	 public void drop1() throws InterruptedException
	 {
		 DropdownAndAlert da1 = new DropdownAndAlert(driver);
		 da1.dropdown();
		 da1.alert1();
		 da1.aler2();
		 da1.alert3();
	 }
	 */
	  @AfterMethod
	    public void suiteTearDown() {
	    	driver.quit();
	    }
	  
	 
}

package demopack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class AllureTest1 {
	WebDriver driver;
  @BeforeClass
  public void setup() {
//	  WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://demowebshop.tricentis.com/"); 
  }
  @Test (priority=1)
  public void logoverification() {
	  boolean Disp_status =driver.findElement(By.xpath("//img[@src='/Themes/DefaultClean/Content/images/logo.png']")).isDisplayed();
	  Assert.assertEquals(true, Disp_status);  
  }
  
  @Test (priority =2)
  public void login() {
driver.findElement(By.xpath("//a[text()='Log in']")).click();
driver.findElement(By.name("Email")).sendKeys("Srini.Godari@Test.com");
driver.findElement(By.name("Password")).sendKeys("{Password123");
driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
Assert.assertEquals("Demo Web Shop Home", driver.getTitle());
	   
  }
  
  @Test (priority =3)
  public void logout() {
	   throw new SkipException("Skipping this test case");
  }
  
  @AfterClass
  public void tearDown() {
	   driver.quit();
  }
}

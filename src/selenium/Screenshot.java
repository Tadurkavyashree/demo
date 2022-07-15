package selenium;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Screenshot {
	WebDriver driver;
  @Test 
  public void Login() throws IOException {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	  driver.findElement(By.id("login-button")).click();
	  driver.findElement(By.id("root"));
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File scr=ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File("C:\\PHOTOS\\photo2.png");
	  Files.copy(scr, dest);
  }
  @Test(priority=1)
  public void screenshot() throws Throwable {
	  driver.findElement(By.xpath("//div[@class='inventory_item_name']")).click();
	  driver.findElement(By.xpath("//div[@class='inventory_details_container']"));
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File scr=ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File("C:\\PHOTOS\\photo.png");
	  Files.copy(scr, dest);
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}

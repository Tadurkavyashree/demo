package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WindowHandling {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.linkText("Login")).click();
	  String parentwindow = driver.getWindowHandle();
	  Set<String> windows = driver.getWindowHandles();
	  Iterator<String> iterator = windows.iterator();
	  while (iterator.hasNext()) {
		  String childwindow = iterator.next();
		  if (!parentwindow.equals(childwindow)) {
			  driver.switchTo().window(childwindow);
		  }
	  }
	  driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("nisha@yopmail.com");
	  driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("nisha123");
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://phptravels.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}

package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class onewindowhandle {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//div[@class='avatar mx-auto white'][1]/..//div[@class='card-up']/../../..")).click();
	  driver.findElement(By.xpath("//span[@class='group-header']")).click();
	  driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
	  driver.findElement(By.xpath("//div[text()='10000']"));
	  String str = driver.findElement(By.xpath("//div[text()='10000']")).getText();
		System.out.println(str);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  //wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	  driver.get("https://demoqa.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.manage().window().maximize();
}
  

  @AfterTest
  public void afterTest() {
  }

}

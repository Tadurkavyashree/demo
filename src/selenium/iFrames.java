package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class iFrames {
	WebDriver driver;
	//WebDriver wait;
  @Test
  public void Element() {
	  driver.switchTo().frame(0);
	  driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  //wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	  driver.get("https://www.selenium.dev/downloads/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}

package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Dataprovider {
	WebDriver driver;
  @Test
  public void Data(String username,String password) {
	  driver.findElement(By.xpath("//input[@id='m_login_email']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@id='m_login_email']")).clear();
	  driver.findElement(By.xpath("//input[@id='m_login_password']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@id='m_login_password']")).clear();
	  //String Data= driver.findElement(By.xpath("//div[@data-sigil='m_login_notice']")).getText();
	  //System.out.println(Data);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://m.facebook.com/login/?locale2=en_GB");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}

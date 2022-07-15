package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Alerts {
	WebDriver driver;
	@Test(priority=1)
	public void AlertswindowHandling() {
		driver.findElement(By.xpath("//span[text()='Documentation']")).click();
		driver.findElement(By.xpath("//li[@id='m-documentationwebdriver-li']//span[text()='WebDriver']")).click();
		driver.findElement(By.xpath("//a[text()='Browser']")).click();
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
			//Alert
		driver.findElement(By.linkText("See an example alert")).click();
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
			//conformation
		driver.findElement(By.linkText("See a sample confirm")).click();
		driver.switchTo().alert().accept();
			//prompt
		driver.findElement(By.linkText("See a sample prompt")).click();
		String str1=driver.switchTo().alert().getText();
		System.out.println(str1);
		driver.switchTo().alert().accept();

		
	}
  @Test
  public void alerts() {
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.selenium.dev/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}

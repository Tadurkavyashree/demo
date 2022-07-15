package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Demoqa {
	WebDriver driver;
	WebDriverWait wait;

  @Test
  public void Element() throws InterruptedException {
	  driver.findElement(By.xpath("//div[@class='avatar mx-auto white'][1]/..//div[@class='card-up']/../../..")).click();
	  driver.findElement(By.xpath("//span[@class='group-header']")).click();
	          //Checkbooks
	  driver.findElement(By.xpath("//span[text()='Check Box']")).click();
	  driver.findElement(By.xpath("//button[@title='Toggle']")).click();
	  Thread.sleep(1500);
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']/..//label[@for='tree-node-documents']")).click();
	  
	  			//radio button
	  driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
	  driver.findElement(By.xpath("//label[@class='custom-control-label']")).click();
	  		//web tables
	  driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
	  driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("Cierra");
	  driver.findElement(By.xpath("//span[@id='basic-addon2']")).click();
	  driver.findElement(By.xpath("//span[@id='edit-record-1']")).click();
	  driver.findElement(By.xpath("//input[@id='age']")).clear();
	  driver.findElement(By.xpath("//input[@id='age']")).sendKeys("50");
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	  //button
	  //wait = new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[contains(text(),'Buttons')]"))));
	  driver.findElement(By.xpath("//*[contains(text(),'Buttons')]")).click();
	 // driver.findElement(By.xpath("//button[@id='doubleClickBtn']")).click();		
	  
  }
  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exes");
		  driver=new ChromeDriver();
		  wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		  driver.get("https://demoqa.com");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}

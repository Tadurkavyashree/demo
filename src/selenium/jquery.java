package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class jquery {
	WebDriver driver;
	Actions act;
  @Test
  public void drag() {
	  driver.findElement(By.xpath("//a[text()='Draggable']")).click();
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//div[@id='draggable']")).click();
	  act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//div[@id='draggable']")),80,180).build().perform();
	  act.release().build().perform();
	  driver.switchTo().defaultContent();
  }
  @Test
  public void drop() {
	  driver.findElement(By.xpath("//a[text()='Droppable']")).click();
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//div[@id='draggable']")).click();
	  act.clickAndHold(driver.findElement(By.xpath("//p[text()='Drag me to my target']"))).build().perform();
	  act.dragAndDrop(driver.findElement(By.xpath("//p[text()='Drag me to my target']")),driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
	  act.release().build().perform();
	  driver.switchTo().defaultContent();
  }
  @Test
  public void resize() {
	  driver.findElement(By.xpath("//a[text()='Resizable']")).click();
	  driver.switchTo().frame(0);
	  act.clickAndHold(driver.findElement(By.xpath("//div[@id='resizable']/div[2]"))).build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//div[@id='resizable']/div[2]")),0,10).build().perform();
	  act.release().build().perform();
	  act.clickAndHold(driver.findElement(By.xpath("//div[@id='resizable']/div[2]"))).build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//div[@id='resizable']/div[1]")),20,0).build().perform();
	  act.release().build().perform();
	  driver.switchTo().defaultContent();
  }
  @Test
  public void selectable() {
	  driver.findElement(By.xpath("//a[text()='Selectable']")).click();
	  driver.switchTo().frame(0);
	  act.clickAndHold(driver.findElement(By.xpath("//li[text()='Item 1']"))).build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//li[text()='Item 4']"))).build().perform();
	  act.release().build().perform();
  }
  @Test
  public void sortable() {
	  driver.findElement(By.xpath("//a[text()='Sortable']")).click();	
	  driver.switchTo().frame(0);
	  act.dragAndDrop(driver.findElement(By.xpath("//ul[@id='sortable']/li[3])")),driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"))).build().perform();
	 driver.switchTo().defaultContent();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  //wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	  driver.get("https://jqueryui.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.manage().window().maximize();
	  act= new Actions(driver);
  }

  @AfterTest
  public void afterTest() {
  }

}

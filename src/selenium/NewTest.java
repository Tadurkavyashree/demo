package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

import java.time.Duration;

import org.openqa.selenium.By;

public class NewTest {
	WebDriver driver;
	

  @Test
  public void login() {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  
  }
  @Test(priority = 2)
  	public void Dropdown() throws InterruptedException {
    driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
    Thread.sleep(50);
    driver.findElement(By.xpath("//option[@value='lohi']")).click();
	 Thread.sleep(30);

    
  } 
	  
	  //throws InterruptedException{
	  //WebElement staticDropdown=driver.findElement(By.className(("product_sort_container")));
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 
	  //Select dropdown= new Select(staticDropdown);
	 // Thread.sleep(30);
	  /*dropdown.selectByIndex(2);
	  System.out.println(dropdown.getFirstSelectedOption().getText());*/
	  //Thread.sleep(40);
	  //.selectByVisibleText("Name (Z to A)");
	 // System.out.println(dropdown.getFirstSelectedOption().getText());
	  //dropdown.selectByValue("lohi");
	  //System.out.println(dropdown.getFirstSelectedOption().getText());

  
  
  @Test(priority = 3)

	 public void cart() throws InterruptedException {
	  driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 //Thread.sleep(2000);
  	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
  	driver.findElement(By.xpath("//button[@id='checkout']")).click();
  	
	  
  }
  
  @Test(priority = 4)
  public void checkout() {
	  driver.findElement(By.id("first-name")).sendKeys("kavyashree");
	  driver.findElement(By.id("last-name")).sendKeys("kavya");
	  driver.findElement(By.id("postal-code")).sendKeys("500036");
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("finish")).click();
	  
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
	  //driver.findElement(By.id(""))
  }

}

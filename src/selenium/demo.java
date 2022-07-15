package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.cssSelector("ytd-searchbox")).sendKeys("oneplus 6T");
		driver.findElement(By.cssSelector("style-scope ytd-searchbox")).click();
	}

}

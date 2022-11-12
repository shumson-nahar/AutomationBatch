package automation6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector_3 {
	public static WebDriver driver;
	@Test
	public void openUrl() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		System.out.println(driver.findElement(By.cssSelector("div#reg_pages_msg")).isEnabled());
		driver.findElement(By.cssSelector("div#reg_pages_msg")).click();
		driver.findElement(By.cssSelector("input#email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("button#login")).click();
		
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("selenium");
		  driver.findElement(By.cssSelector("input#lastname")).sendKeys("Panda");
		  driver.findElement(By.cssSelector("input#reg_email__")).sendKeys("seleniumpanda@gmail.com");
		  
		  driver.findElement(By.cssSelector("input#reg_email_confirmation__")).sendKeys(
		  "seleniumpanda@gmail.com");
		
		 
}
}

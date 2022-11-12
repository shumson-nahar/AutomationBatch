package automation6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector_4 {
	public static WebDriver driver;
	@Test
	public void openUrl() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement ( By.cssSelector ( "input[name=q]" ) ).sendKeys("ebay");
		driver.findElement(By.cssSelector("input[name=btnK]")).submit();
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.cssSelector("input[name=identifier]")).sendKeys("shumson805@gmail.com");
		
		driver.findElement(By.cssSelector("input[name=firstName]")).sendKeys("Shumson");
		driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("Nahar");
		
		
		
	}
		
		


@AfterTest
public void tearDown() {
}
}

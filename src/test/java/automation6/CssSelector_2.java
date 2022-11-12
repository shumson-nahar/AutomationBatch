package automation6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector_2 {
	public static WebDriver driver;
	@Test
	public void openUrl() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ebay.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("OnePlus6T");
		driver.findElement(By.cssSelector("#gh-btn")).click();
		driver.findElement(By.cssSelector("span#gh-ug-flex")).click();
		driver.findElement(By.cssSelector("class.'typeahead__button'")).click();
		
		
	}
		
		


		


}




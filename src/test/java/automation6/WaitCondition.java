package automation6;


	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WaitCondition {
		
		public static WebDriver driver;
		
	
			
		

		@BeforeTest
		public void openUrl() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
		}
		


		@Test
		public void logintest() throws InterruptedException {
			
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			
			driver.findElement(By.name("password")).sendKeys("admin123");
			WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		    Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(loginbutton)).click();
			
			
		}
		
		@AfterTest
		public void tearDown() {
			//driver.quit();
		}

	}





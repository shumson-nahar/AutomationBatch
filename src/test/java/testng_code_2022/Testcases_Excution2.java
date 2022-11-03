package testng_code_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcases_Excution2 {
	 WebDriver driver;
		@BeforeTest
		
		public void beforeTest() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		@Test
		public void testcase1() {
			driver.get("http://calculator.net");
			

	}
		@Test
		public void testcase2() {
			driver.findElement(By.xpath("//input[@id='calcSearchTerm']")).click();
			
		}
		@Test
		
		  public void testcase3() {
		  driver.findElement(By.xpath("//span[@id='bluebtn']")).click(); 
		 
		  }
		@Test
		public void testcase4() throws InterruptedException {
			driver.findElement(By.linkText("Financial Calculators")).click();
			Thread.sleep(2000);
		}
		@Test
		public void testcase5() throws InterruptedException {
			driver.findElement(By.linkText("Mortgage Calculator")).click();
			Thread.sleep(2000);
		}
		
		@Test
		public void testcase6() throws InterruptedException {
			driver.findElement(By.partialLinkText("Loan ")).click();
			Thread.sleep(2000);
		}
		
		
		 @AfterTest
		 public void tearDown() {
			 driver.quit();
			 
		 }

	}



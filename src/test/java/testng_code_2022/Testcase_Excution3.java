package testng_code_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_Excution3 {
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
		driver.get("http://automationpractice.com");
	}
	@Test
	public void testcase2() throws InterruptedException {
		driver.findElement(By.className("login")).click();
		Thread.sleep(2000);
	}
		@Test
		public void testcase3() throws InterruptedException {
			driver.findElement(By.id("email_create")).sendKeys("shumson805@gmail.com");
			driver.findElement(By.id("SubmitCreate")).click();
			String pageHeading =driver.findElement(By.className("page-heading")).getText();
			System.out.println("page Heading:"+pageHeading);
			Thread.sleep(2000);
		
	}
		@Test
		public void testcase4() throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Shumson");
			Thread.sleep(2000);
		}
		@Test
		public void testcase5() throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Nahar");
			Thread.sleep(2000);
		}
	 @AfterTest
	 public void tearDown() {
		 driver.quit();
		 
	 }

}

package testng_code_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcases_Excution1 {
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
		driver.get("https://google.com");
		

}
	@Test
	public void testcase2() throws InterruptedException {
		driver.findElement(By.name("q")).click();
		Thread.sleep(3000);
	}
	@Test
	public void testcase3() throws InterruptedException {
		driver.findElement(By.name("btnK")).sendKeys("iphone");
		Thread.sleep(3000);
	}
	
		@Test
		public void testcase4() throws InterruptedException {
			 By.xpath ( "(//input[@name='btnk']0[1]" );
			Thread.sleep(3000);
		}

		
	
	 @AfterTest
	 public void tearDown() {
		 driver.quit();
		 
	 }

}
//By searchbox = By.xpath ( "//input[@name='q']" );
//By Search_btn = By.xpath ( "(//input[@name='btnk']0[1]" );
//By Facebook_link = By.xpath ( "//a//h3[text()='Facebook - log in or sign up']" );

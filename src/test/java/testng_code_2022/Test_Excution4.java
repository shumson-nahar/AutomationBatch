package testng_code_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Excution4 {
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
		driver.get("http://facebook.com");
	}
	@Test
	public void testcase2() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).click();
		Thread.sleep(2000);
	}
	@Test
	public void testcase3() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("kumron");
		Thread.sleep(2000);
	}
	@Test
	public void testcase4() throws InterruptedException {
		driver.findElement(By.name("lastname")).sendKeys("Nahar");
		Thread.sleep(2000);
	}
	@Test
	public void testcase5() throws InterruptedException {
		driver.findElement(By.name("reg_email__")).sendKeys("nahar@gmail.com");
		Thread.sleep(2000);
	}
	@Test
	public void testcase6() throws InterruptedException {
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nahar@gmail.com");
		Thread.sleep(2000);
	}
	@Test
	public void testcase7() throws InterruptedException {
		driver.findElement(By.name("password_step_input")).sendKeys("abcdefgh71b71");
		Thread.sleep(2000);
	}
	 @AfterTest
	 public void tearDown() {
		 driver.quit();
		 
	 }
}

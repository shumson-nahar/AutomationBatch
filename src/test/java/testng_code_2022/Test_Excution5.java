package testng_code_2022;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Test_Excution5 {
	WebDriver driver;
	@BeforeTest
	
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(priority=1,enabled=true)
	public void testcase1() {
		 driver.get("http://zero.webappsecurity.com/login.html");
		
	}
	@Test(priority=2)
	public void testcase2() {
		 WebElement txtbx_username=driver.findElement(By.name("user_login"));
		 txtbx_username.sendKeys("username");
		
	}
	@Test(priority=3)
	public void testcase3() {
		driver.findElement(By.name("user_password")).sendKeys("password");
	}
	@Test(priority=4)
	public void testcase4() {
		driver.findElement(By.name("submit")).click();
	}
		
		@Test(priority=5)
		public void testcase5() {
			
			String expected_title = "Zero - Account Summary";
			String actual_title = driver.getTitle();
			
			//Assert.assertEquals(expected_title,actual_title);
			
			}
		@AfterTest public void tearDown() { driver.quit();
}
}
		





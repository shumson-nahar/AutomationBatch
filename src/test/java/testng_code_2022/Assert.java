package testng_code_2022;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert {
	public static WebDriver driver;
	@Test
	public void logic1() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rediff.com");
		Assert.assertTrue(driver.findElement(By.className("signin")).isEnabled());
		driver.findElement(By.className("signin")).click();
		
		String currentTitle = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Assert.assertEquals(currentTitle,"Rediffmail");
		Assert.assertEquals(currentUrl,"https//mail.erdiff.com/cgi-bin/login.cgi")
		
	}
	
	
		
	}
	

	



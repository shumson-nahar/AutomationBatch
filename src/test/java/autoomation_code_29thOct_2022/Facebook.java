package autoomation_code_29thOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static WebDriver driver;
	public static Select select;
	public static ChromeOptions options;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).isEnabled();
		driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Shumson");
		driver.findElement(By.name("lastname")).sendKeys("Nahar");
		driver.findElement(By.name("reg_email__")).sendKeys("shumson805@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shumson805@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("@12345");
		
		select  = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("April");
		
		select  = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("17");
		select  = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1971");
		
	}

}

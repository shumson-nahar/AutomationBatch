package automation_code_9thOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Xpath1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class ='login")).click();
		driver.findElement(By.xpath("//input[@id ='email_create']")).sendKeys("helloworld232@gmail.com");
		driver.findElement(By.xpath("//button[@id ='SubmitCreate']")).click();
		driver.findElement(By.xpath("//input[@id ='id_gender2']")).click();
		driver.findElement(By.xpath("//input[@id ='customer_firstname'")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id ='customer_lastname'")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id ='passwd'")).sendKeys("Selenium@123");
	
		driver.close();
		
		
		
		
		
		
	}

}

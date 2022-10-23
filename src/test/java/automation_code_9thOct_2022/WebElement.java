package automation_code_9thOct_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Dress");
		
		  driver.findElement ( By.xpath ( "//input[class='name='email']" ) ).sendKeys("email");
		  
		
		  
			/*
			 * driver.findElement ( By.tagName ( "button" ) ).click(); driver.findElement (
			 * By.tagName ( "a" ) ).click();
			 * 
			 * 
			 * driver.findElement ( By.cssSelector ( "input[name='email']" ) ).click();
			 * driver.findElement ( By.xpath ( "//input[@id='email']" ) ).click();
			 * driver.findElement ( By.xpath ( "//input[@name='email']" ) ).click(); //
			 * driver.findElement ( By.xpath ( "//input[@data-testid='royal_email']" )
			 * ).click();
			 */	        driver.quit();				
							
							
								
		

	}

}

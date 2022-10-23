package automation_code_9thOct_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement1 {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver ( );

	        driver.manage ( ).timeouts ( ).implicitlyWait ( 40,TimeUnit.SECONDS );
	        driver.get ( "https://login.yahoo.com/" );
	        Thread.sleep ( 2000 );
	        driver.manage ( ).window ( ).maximize ( );
	        String expectedTitle = "login.yahoo.com: a new experience";
	        String actualTitle = driver.getTitle ( );
	        
	        driver.findElement( By.id ( "email" ) ).sendKeys ( "shumson805@gimail.com");
	        driver.findElement ( By.tagName ( "button" ) ).click();
	        driver.findElement ( By.tagName ( "a" ) ).click();


	        driver.findElement ( By.cssSelector ( "input[name='email']" ) ).click();
	        driver.findElement ( By.xpath ( "//input[@id='email']" ) ).click();
	        driver.findElement ( By.xpath ( "//input[@name='email']" ) ).click();
	        driver.findElement ( By.xpath ( "//input[@data-testid='royal_email']" ) ).click();
	        driver.quit();

	}

	   

	



      

	    }
	

	



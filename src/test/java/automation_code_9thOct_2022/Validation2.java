package automation_code_9thOct_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl ="google.com";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "google";
		String expectedTitle = driver.getTitle();
		
		if(actualCurrentUrl.equals(expectedCurrentUrl) && actualTitle.equals(expectedTitle)){
			driver.findElement(By.xpath("//input[contains(@id,'login1'")).
			sendKeys("seleniumpanda@amazonmail.com");
			
			driver.findElement(By.xpath("//input[contains9@id,'password'")).
			sendKeys("Selenium@123");
			
		}else {
			System.out.println("my url is not correct");
		}

	}



	}



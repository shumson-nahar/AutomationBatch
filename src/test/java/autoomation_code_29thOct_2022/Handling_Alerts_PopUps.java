package autoomation_code_29thOct_2022;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Alerts_PopUps {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Alert alert = driver.switchTo().alert();
		String text =  alert.getText();
		System.out.println("Text of the alert is :" + text);
		if (text.equals("please enter a valid user name")) {
			Thread.sleep(2000);
			alert.accept();
			
		}else {
			alert.dismiss();
			
		}Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("selenium123");
		
				

	}

}

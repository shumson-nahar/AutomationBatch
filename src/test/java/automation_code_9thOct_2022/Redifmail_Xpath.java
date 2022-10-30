package automation_code_9thOct_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redifmail_Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		
		
		  driver.findElement(By.xpath("//input[contains(@class,'signinbtn')]"));
		  driver.findElement(By.xpath("//input[contains(@id,'login1')]")).
		  sendKeys("seleniumpanda@redifmail.com");
		  driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(
		  "Selenium@123");
		  driver.findElement(By.xpath("//a[contains(@class, 'mailicon')]")).click();
		 
		driver.findElement(By.xpath("//*[@class='mailicon']")).click();
		driver.findElement(By.xpath("//a[@class=' moneyicon relative']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'bmailicon relative')]")).click();
		driver.findElement(By.xpath("//a[(@class='bmailicon relative')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'vdicon')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'shopicon relative')]")).click();
		driver.findElements(By.xpath("//a[contains(@class, 'signin')]")).clear();
		

	}

}

package automation_code_9thOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Advanced_Xpaths1 {
	public static WebDriver driver;
	public static void main(String[] args) {
	     WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facebook.com/");
		
		//Find the sign-up button from the registration form present in the Facebook application. (child)
		
		driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[10]")).click();
		
		//Locate Firstname field from SignUp button in facebook (parent)
		
		driver.findElement(By.xpath("//button[@id='u_0_s_E5']'/parent::*/parent::*/child::div[1]/div/div[1]"))
		.sendKeys("Firstname");
		//Identify the password from Mobile number filed in facebook.(Following)
		
		driver.findElement(By.xpath("//input[@id='u_0_g_/B']/following::input")).click();
		
		//Locate Mobile number from newpassword field in facebook (preceding)
		
		driver.findElement(By.xpath("//input[@id='password_step_input']/preceding::input[2]")).getText();
		
		//Locate lastname from female radio button in facebook(Ancestor)
		
		driver.findElement(By.xpath("//input[@id='u_0_4_9A']/ancestor::div[2]/div[1]/div/div[2]"));
	
        driver.findElement(By.xpath("//input[@id='u_0_4_9A']/ancestor::div[2]/input[@id='u_0_o]"));
	}

}

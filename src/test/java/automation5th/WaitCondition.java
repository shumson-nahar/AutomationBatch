package automation5th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WaitCondition {
	public static WebDriver driver;
	public static SoftAssert softassert;
	@BeforeTest
	public void openUrl() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		}
	@Test
	public void clickOnsignlnLink() {
		WebElement signinLink = driver.findElement(By.className("signin"));
		softassert = new SoftAssert();
		softassert.assertTrue(signinLink.isEnabled());
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until( ExpectedConditions.elementToBeClickable(signinLink)).click();
		softassert.assertAll();
	}
	@Test
	public void loginCredentials() {
		WebElement usernameTextBox = driver.findElement(By.id("login"));
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		softassert.assertTrue(usernameTextBox.isEnabled());
		softassert.assertTrue(passwordTextBox.isEnabled());
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until( ExpectedConditions.elementToBeClickable(signinLink)).click();
		softassert.assertAll();
		
	}
	

	/*
	 * public void login() { driver.findElement(By.className("login")).click();
	 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	 * driver.findElement(By.name("email")).sendKeys("seleniumpanda@gmail.com");
	 * driver.findElement(By.id("passwd")).sendKeys("selenium@123");
	 * driver.findElement(By.id("SubmitLogin")).click();
	 */
	
	@AfterTest
	public void tearDown() {
}
}

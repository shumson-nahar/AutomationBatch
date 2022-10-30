package autoomation_code_29thOct_2022;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenShot {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://openweathermap.org/");
		
		WebElement owmScreen = driver.findElement(By.cssSelector("div.section.where-to"));
		File source = owmScreen.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir"))+"");
		FileHandler.copy(source, destination);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://shaadi.com");
		
		WebElement shaadiBanner.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(System.getProperty(("user.dir"))+"");
		FileHandler.copy(source, destination1);
		

	}

	
		
	}



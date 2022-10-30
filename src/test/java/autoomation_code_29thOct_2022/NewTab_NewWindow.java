package autoomation_code_29thOct_2022;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab_NewWindow {
	public static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver .switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://google.com");
		
		driver .switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://amazon.com");
		
		driver .switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://costco.com");
	 
		openWindow();
		driver.quit();
		
		
		

	} 
	static void openWindow() {
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://easemytrip.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://rediff.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://facebook.com");
		
		driver.quit();
		
		
	}


		
	}



package automation_code_9thOct_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_if_Else_in_Automation {
	public static WebDriver driver;

	public static void main(String[] args) {
		String Browser ="Chrome";
		String Browser1 ="Firefox";
		String Browser2="Edge";
		if(Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
			
			
			
		}else if (Browser1.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://flipkart.com");
			
			
		}else  if(Browser2.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://Amazon.com");
			
		}else {
			System.out.println("None of the browser works");
		}
		
	

	}

}

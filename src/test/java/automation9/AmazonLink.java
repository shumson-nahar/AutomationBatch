package automation9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLink {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		
		  
		List<WebElement> AmazonLinks =  driver.findElements(By.tagName("a"));
		for(int i=0; i<AmazonLinks.size(); i++) {
			   WebElement TotalLinks = AmazonLinks.get(i);
			   System.out.println(TotalLinks.getText() + "-----" + TotalLinks.isDisplayed());
		}
	
		}
		
		
		
		
	}

	
	



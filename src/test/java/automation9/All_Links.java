package automation9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Determine all links of a WebPage

public class All_Links {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://ebay.com");
		driver.manage().window().maximize();
		
		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
	  System.out.println("All links found on web page are: " +allLinks.size() + " links ");
	  
	  for (WebElement link :allLinks ) {
		  System.out.println(link.getAttribute("href"));
		  System.out.println(link.getText());
		  
		  driver.quit();
	  }
	}
}



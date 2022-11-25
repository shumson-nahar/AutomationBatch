package automation9;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Print the names of the respective links

public class GoogleLink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com/ncr");
		driver.manage().window().maximize();
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		
		for(WebElement link:links) {
			System.out.println(link.getAttribute("href"));
		}
		driver.quit();

	}

}

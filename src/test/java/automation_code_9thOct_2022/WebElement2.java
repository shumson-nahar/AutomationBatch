package automation_code_9thOct_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver ();
          driver.manage ().timeouts ().implicitlyWait ( 10,TimeUnit.SECONDS );
          driver.manage().window ().maximize();
           driver.get ( "https://amazon.com" );
           

           String expectedTitle ="Amazon.com: spend less. smile more.";
           String actualTitle = driver.getTitle ();
           
           driver.findElement ( By.id ( "twotabsearchtextbox" ) ).sendKeys ( "java book" );
           
           driver.findElement ( By.xpath ( "//*[@id='nav-search-submit-button']" ) ).click ();
           driver.findElement ( By.xpath ( "//*[@id=\"searchDropdownBox\"]" ) ).click();
           driver.findElement ( By.linkText ( "New Releases" )) .click();
           driver.findElement ( By.id ( "twotabsearchtextbox" ) ).sendKeys ( "Iphone x" );
           driver.findElement ( By.id ( "nav-search-submit-button" ) ).click ();
           driver.findElement(By.linkText
        		   ("Apple iPhone X, 64GB, Silver - For T-Mobile (Renewed)")).
           click();
           
           driver.findElement(By.linkText("Customer Service")).click();
           driver.findElement(By.linkText("Best Sellers")).click();
           driver.findElement(By.linkText("Amazon Basics")).click();
          
           driver.findElement ( By.id ( "twotabsearchtextbox" ) ).sendKeys ( "selenium book" );
          Thread.sleep(3000);
           driver.quit();


	}

}

package automation_code_9thOct_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWeather {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver ();
         driver.manage ().timeouts ().implicitlyWait ( 10,TimeUnit.SECONDS );
         driver.manage().window ().maximize();
         driver.get ( "https://openweathermap.org/" );
         

         String expectedTitle ="Weather forecass,nowcasts and history in a fast and elegant way";
         String actualTitle = driver.getTitle ();
         driver.findElement(By.xpath("//li[@class='logo']/descendant::img[1]")).click();
         driver.findElement(By.xpath("//li[@class='logo']/child::a/child::img[1]")).click();
         driver.findElement(By.xpath("//ul[@id='first-level-nav']/descendant::img[1]")).click();
         driver.findElement(By.xpath("//div[@id='banner_android']/descendant::img[1]")).click();
         
	}

}

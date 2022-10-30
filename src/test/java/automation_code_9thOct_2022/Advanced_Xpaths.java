package automation_code_9thOct_2022;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Advanced_Xpaths {

	
		public static WebDriver driver;

		public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
//self
		
String text=driver.findElement(By.xpath(" //a[contains(text(),'Craftsman Automation')]/self::a")).getText();
 System.out.println(text);
  //parent
 
 text= driver.findElement(By.xpath(" //a[contains(text(),'Craftsman Automation')]/parent::td")).getText();
 System.out.println(text);
 //Child - Selects all ancestors(parent, grandparent,etc.)
 
List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'Craftsman Automation')]/ancestor::tr/child::td"));
System.out.println("Number of child elements:" + childs.size());

//Ancestor - Selects all descendants(children, grandchildren, etc.)

text=driver.findElement(By.xpath("//a[contains(text(),'Craftsman Automation')]/ancestor::tr")).getText();
System.out.println(text);

//Descendant

List<WebElement>descendants=driver.findElements(By.xpath("//a[contains(text(),'Craftsman Automation')]/ancestor::tr/descendant::*"));
 
System.out.println("Number of descendant nodes:" +  descendants.size());

// Following - Selects everything in the document after the closing tag of the current node

List<WebElement>followingnodes=driver.findElements(By.xpath("//a[contains(text(),'Craftsman Automation')]/ancestor::tr/following::tr"));
System.out.println("Number of following nodes :" +  followingnodes.size());
//Following - sibling : Selects all siblings after the current node 
List<WebElement>followingsiblings=driver.findElements(By.xpath("//a[contains(text(),'Craftsman Automation')]/ancestor::tr/following-sibling::tr"));
System.out.println("Number of Following Siblings:" +  followingsiblings.size());
//Preceding - Selects all nodes that appear before the current nose in the document
List<WebElement>precedings=driver.findElements(By.xpath("//a[contains(text(),'Craftsman Automation')]/ancestor::tr/preceding::tr"));
System.out.println("Number of preceding nodes:" +  precedings.size());
//preceding-sibling - Selects all siblings before the current node
List<WebElement>precedingsiblings=driver.findElements(By.xpath("//a[contains(text(),'Craftsman Automation')]/ancestor::tr/preceding-sibling::tr"));
System.out.println("Number of preceding sibling:" +  precedingsiblings.size());

driver.close();

	}
		

}

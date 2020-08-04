package SeleniumConcepts;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sebahattingokaydin/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");

		String title= driver.getTitle();
		System.out.println(title);
		
		if (title.equals("My Store")) {
			System.out.println("Title is correct");
			
		}
		else{System.out.println("incorrect title");}

	String url= driver.getCurrentUrl();
	System.out.println(url);
	
	if (url.equals("http://automationpractice.com/index.php"))
 {System.out.println("Correct url");}
	else{System.out.println("incorrect");}
	Thread.sleep(2000);
//driver.quit();
driver.close();
}
}
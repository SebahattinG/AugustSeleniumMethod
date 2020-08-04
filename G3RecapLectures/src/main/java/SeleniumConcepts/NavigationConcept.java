package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sebahattingokaydin/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.youtube.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.booking.com");
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
	}

}
//GET METHOD: 
// driver get method is used to open a URL and it will wait until the page is fully loaded. 

//NAVIGATE().TO METHOD :
//Driver.navigate().to method navigates to a URL and it wil not wait until the webpage is loaded.
//
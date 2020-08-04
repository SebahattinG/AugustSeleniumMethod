package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_07_NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/sebahattingokaydin/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		//Navigate method
		
		driver.navigate().to("https://www.ebay.com");
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();// on ebay
		Thread.sleep(4000);
		driver.navigate().back();//amazon
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.quit();
	}

}

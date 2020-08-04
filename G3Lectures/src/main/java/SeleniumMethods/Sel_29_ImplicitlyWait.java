package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_29_ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Title is : "+ driver.getTitle());
		
		//Implicitly Wait tells webdriver to wait if the element is not available immediately
		//and webdriver waits  till the element is visible in specific time.
		//it will throw NoSuchElementException
		
		//implicitly wait can be used just for elements.
		
		Thread.sleep(5000);
		
	}

}

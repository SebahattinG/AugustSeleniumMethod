package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Sel_02_WebDriverWithFireFox {

	public static void main(String[] args) {
		//Set Property
		
				System.setProperty("webdriver.gecko.driver", "/Users/sebahattingokaydin/Documents/Drivers/geckodriver");
				
			//setup browser
				WebDriver driver = new FirefoxDriver();
				
				//Launch Browser
				
				driver.get("https://siliconelabs.com/");// org.openga.selenium.WebDriverException
														//org.openga.selenium.Invalid.ArgumentException	
				//get title method :
				
				String title = driver.getTitle();
				System.out.println(title);
				if (title.equals("Homepage - SiliconeLabs")) {System.out.println("Title is correct");}
				else{System.out.println("Title is not correct");}
				
					
				String url = driver.getCurrentUrl();
				System.out.println(url);
				if (url.equals("https://siliconelabs.com/")) {System.out.println("Correct URL");}
				
			//	System.out.println(driver.getPageSource());
				
				
				//driver.close();
				driver.quit();

	}

}

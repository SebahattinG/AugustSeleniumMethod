package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_43_HeadlessChromeBrowser {

	public static void main(String[] args) {
		// you can exectue your test case without browser
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver= new ChromeDriver(co);
		driver.get("http://siliconelabs.com");
		
		System.out.println(driver.getTitle());
		
	}

}

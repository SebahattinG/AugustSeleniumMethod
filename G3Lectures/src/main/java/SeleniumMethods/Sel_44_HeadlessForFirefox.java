package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_44_HeadlessForFirefox {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
FirefoxOptions fo = new FirefoxOptions();
fo.addArguments("--headless");

WebDriver driver= new FirefoxDriver(fo);
driver.get("http://siliconelabs.com");
System.out.println(driver.getTitle());
	}

}

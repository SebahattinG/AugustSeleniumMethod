package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_45_HTMLUnitDriverHeadless {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new HtmlUnitDriver();
	
	driver.get("http://siliconelabs.com");
	System.out.println(driver.getCurrentUrl());
		
	}

}

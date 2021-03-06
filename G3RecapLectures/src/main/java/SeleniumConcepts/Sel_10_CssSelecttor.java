package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_10_CssSelecttor {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.linkedin.com/login");
		//CSS Selector
		// #id
		//classNames(.)
		// tag [attribute='value'] 
		//tag [attribute='value'] tag [attribute='value'] 
		
//		WebElement userName=driver.findElement(By.cssSelector("input[aria-label='Email or Phone']"));
		WebElement userName=driver.findElement(By.cssSelector("#username"));
		userName.sendKeys("sebahattin");
	}

}

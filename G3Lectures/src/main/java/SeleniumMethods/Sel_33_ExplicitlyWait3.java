package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_33_ExplicitlyWait3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		WebDriverWait wait= new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		System.out.println("Title is : "+ driver.getTitle());
		
		By email= By.id("username");
		By password = By.id("password");
		By loginBtn= By.id("loginBtn");
		
		
		getElement(driver, email, 5000).sendKeys("sebahattin@hotmali.com");
		getElement(driver, password, 5000).sendKeys("123456789");
		getElement(driver, loginBtn, 5000).click();
		
	}
	
		public static WebElement getElement(WebDriver driver, By locator, int timeout){
			waitForPresenceOfElement(driver, locator, timeout);
			WebElement element= driver.findElement(locator);
			return element;
			
		}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param timeout
	 */
	
	public static void waitForPresenceOfElement(WebDriver driver, By locator, int timeout){
		
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
	}

}

package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_20_DropdDown4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sebahattingokaydin/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		By day =By.id("day");
		By month = By.id("month");
		By year = By.id("year");
	selectDropDownByIndex(driver, day, 9);
	selectDropDownByIndex(driver, month, 12);
	selectDropDownByIndex(driver, year, 13);
	}
	
	/**
	 * Visible Text
	 * @param driver
	 * @param locator
	 * @param value
	 */
		public static void selectDropDownByIndex(WebDriver driver, By locator , int index){
			
			WebElement element =getElement(driver, locator);
			Select select = new Select(element);
			select.selectByIndex(index);
			
			
		}
		/**
		 * Get Element
		 * @param driver
		 * @param locator
		 * @return
		 */
		public static WebElement getElement(WebDriver driver, By locator){
			WebElement element = driver.findElement(locator);
			return element;
			
			
			
			
		
	}

}

package SeleniumMethods;

import java.sql.Driver;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class Sel_19_DropDown_3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sebahattingokaydin/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		By day =By.id("day");
		By month = By.id("month");
		By year = By.id("year");
	
		selectDropDownByVisibleText(driver, day, "14");
		selectDropDownByVisibleText(driver, month, "Sep");
		selectDropDownByVisibleText(driver, year, "1999");
		getElement(driver, day);
	}
	
	/**
	 * Visible Text
	 * @param driver
	 * @param locator
	 * @param value
	 */
		public static void selectDropDownByVisibleText(WebDriver driver, By locator , String value){
			
			WebElement element =getElement(driver, locator);
			Select select = new Select(element);
			select.selectByVisibleText(value);
			
			
		}
	
		public static void dropdown(WebDriver driver, By locator, String value) {
			WebElement element =getElement(driver,locator);
			
			Select select = new Select(element);
			select.selectByVisibleText(value);
			
			
			
			
			
		}
		
//		public static void selectDropdown(WebDriver driver, By locator, String value){
//			WebElement element= getElement(driver, locator);
//			Select select= new Select(element);
//			select.selectByVisibleText(value);
//			
//		}
	
	
		/**
		 * Get Element
		 * @param driver
		 * @param locator
		 * @return 
		 * @return
		 */
//		public static WebElement getElement(WebDriver driver, By locator){
//			WebElement element = driver.findElement(locator);
//			return element;
			
			
			
			
//		}
		public static WebElement getElement(WebDriver driver, By locator){
			
			WebElement element= driver.findElement(locator);
			return element;
			
			
		}
			
		}


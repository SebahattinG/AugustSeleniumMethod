package SeleniumConcepts;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLService;

/**
 * 
 * @author sebahattingokaydin
 *
 */


public class ElementUtil {
	//We create common methods for all test cases
	//We can use these methods again and again
	
	/**
	 * This method is for alert handling
	 * @param driver
	 * @return
	 */
public static String getAlertText(WebDriver driver){
		Alert alert= driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}
	
public static WebDriver launchBrowser(WebDriver driver, String browserName) {
	if(browserName.equals("chrome")) {

		System.setProperty("webdriver.chrome.driver", "/Users/sebahattingokaydin/Documents/Drivers/chromedriver");
		
		driver = new ChromeDriver();
	}
	else if(browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "/Users/sebahattingokaydin/Documents/Drivers/geckodriver");
		driver = new FirefoxDriver();
	}
	else {
		System.out.println("Browser is not available "+ browserName);
	}
	return driver;
}

/**
 * This method id used to navigate url
 * @param driver
 * @param url
 */
public static void launchURL(WebDriver driver, String url){
	driver.get(url);
	
}

public static String getPageTitle(WebDriver driver){
	return driver.getTitle();
	
}
/**
 * This method is used to get element.
 * @param driver
 * @param locator
 * @return
 */
public static WebElement getElement(WebDriver driver, By locator) {
	WebElement element= driver.findElement(locator);
	return element;
	
}
public static List<WebElement> getElements(WebDriver driver){
	List<WebElement> userElements = driver.findElements(By.tagName("a"));
	
	return userElements;
	
	
	
}

/**
 * This method is used to get element from HTML
 * @param driver
 * @param locator
 */
public static void clickOn(WebDriver driver, By locator) {
	driver.findElement(locator).click();
	
}
/**
 * 
 * This is quit method
 * @param driver
 */
public static void closeBrowser(WebDriver driver) {
	driver.close();
	
}
public static void quitBrowser(WebDriver driver){
	driver.quit();
}

public static void  sendKeys(WebDriver driver, By locator, String keys) {
driver.findElement(locator).sendKeys(keys);
	
}
}

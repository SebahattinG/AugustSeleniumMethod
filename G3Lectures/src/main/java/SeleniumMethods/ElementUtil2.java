package SeleniumMethods;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementUtil2 {

private static final java.util.List<WebElement> Webelements = null;


/**
 * Get Alert 
 * 
 * @param args
 * @return 
 */
	
	public static String GetAlert(WebDriver driver){
		
		Alert alert=driver.switchTo().alert();
		String text= alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}
		
	/*
	 * Web Browser Choosing
	 */
	public static WebDriver  WebBrowser(WebDriver driver, String webbrowser, String url) {
		
		if (webbrowser.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if (webbrowser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}
		return driver;
	}
	/*
	 * Launch Url
	 */
		public static void  getUrl(WebDriver driver, String url) {
			
			driver.get(url);
			
		}
		
		/*
		 * Get page Title
		 */
		public static String getPageTitle(WebDriver driver){
			return driver.getTitle();
		}
		/*
		 * Get element method
		 */
		public static WebElement getElement(WebDriver driver, By locator){
			
			WebElement element= driver.findElement(locator);
			
			return element;
		}
		
//		public static void List(WebDriver driver){
//		List<Webelements>= driver.findElements(By.tagName("a"));
//			
			
			
//		}
		public static void clickon(WebDriver driver, By locator){
			driver.findElement(locator).click();
			
			
		}
		public static void close(WebDriver driver){
			driver.close();
			
		}
		public static void quit(WebDriver driver){
			driver.quit();
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

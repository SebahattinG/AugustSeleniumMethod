package SeleniumMethods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sel_40_JavaScriptUtilExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
//		driver.get("https://app.hubspot.com/login");
		driver.get("https://darksky.net");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//System.out.println(driver.getTitle());

		String title= JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		
		//click with JS
		WebElement signUp= driver.findElement(By.linkText("Sign up"));
//		JavaScriptUtil.clickElementByJS(signUp, driver);
//		JavaScriptUtil.drawBorder(signUp, driver);
		Thread.sleep(2000);
		//refresh with JS
//		JavaScriptUtil.refreshBrowserByJS(driver);
		
		//Generate Alert with JS
		
//		JavaScriptUtil.generateAlert(driver, "This page is  sign up page");
		
		//Send keys with JS
		
//		WebElement username =driver.findElement(By.id("username"));
//		JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "sebahattin@hotmail.com");
//		JavaScriptUtil.drawBorder(username, driver);
		
		
		//flash method with JS
//		WebElement username=driver.findElement(By.id("username"));
//		WebElement password	=driver.findElement(By.id("password"));
//		WebElement login=driver.findElement(By.id("loginBtn"));
//			
//		JavaScriptUtil.flash(username, driver);
//		username.sendKeys("sebahattin@hotmail.com");
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("12334555");
//		
//		JavaScriptUtil.flash(login, driver);
//		login.click();
		
		//System.out.println(JavaScriptUtil.getPageInnerText(driver));
		// System.out.println(JavaScriptUtil.getBrowserInfo(driver));
		
	JavaScriptUtil.scrollPageDown(driver);
	JavaScriptUtil.specificScrollPageDown(driver);
	
	WebElement privacy= driver.findElement(By.xpath("//a[contains(text(),'Privacy']"));
	JavaScriptUtil.scrollIntoView(privacy, driver);
	JavaScriptUtil.clickElementByJS(privacy, driver);
	
	
	
	}

}

package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_08_IDConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize or fullscreen make the current screen full
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		//ID
		//ID is a locator in DOM id is unique
		
		//First Usage:
		
		WebElement userElement = driver.findElement(By.id("username"));
		userElement.sendKeys("sebahattin@hotmail.com");
		
		WebElement userPassword = driver.findElement(By.id("password"));
		userPassword.sendKeys("123344");
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		loginBtn.click();
		
		//Second Usage
		
		driver.findElement(By.id("username")).sendKeys("sebahattin@htotmail");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("loginBtn"));
		
		//Third Usage
		By username = By.id("username");
//		WebElement userElement = driver.findElement(username);
		userElement.sendKeys("sfsdfsdf@hotmail.com");
		
		By password = By.id("password");
//		WebElement userPassword = driver.findElement(password);
		userPassword.sendKeys("sebahattin2000@hotmail.com");
//		By loginBtn = By.id("loginBtn");
//		WebElement userLgoinBtn = driver.findElement(loginBtn);
//		userLgoinBtn.click();;
	//Fourth Usage
		
		ElementUtil.getElement(driver, username).sendKeys("gsgsg@hotmail.com");
		ElementUtil.getElement(driver, password).sendKeys("12345");
//		ElementUtil.getElement(driver, loginBtn).click();
		
		
		
		
	}

}

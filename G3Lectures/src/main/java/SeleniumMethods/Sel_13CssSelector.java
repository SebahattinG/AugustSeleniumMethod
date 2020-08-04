package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_13CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		By username= By.cssSelector("#username");
		ElementUtil.getElement(driver, username).sendKeys("sebahattin@hotmail.com");
		By password= By.cssSelector("#password");
		ElementUtil.getElement(driver, password).sendKeys("123345");
		By loginBtn= By.cssSelector("#loginBtn");
		ElementUtil.getElement(driver, loginBtn).click();
		
		//Tag name will passed now
		

	}

}

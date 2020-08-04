package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_10_ClassNameConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//form-control private-form__control login-email
		
		By username = By.className("login-email");
		ElementUtil.getElement(driver, username).sendKeys("sebahattin@htomail.com");
		Thread.sleep(2000);
		By password = By.className("m-bottom-3");
		ElementUtil.getElement(driver, password).sendKeys("12345");
//		By loginBtn= By.className("")
		
	}

}

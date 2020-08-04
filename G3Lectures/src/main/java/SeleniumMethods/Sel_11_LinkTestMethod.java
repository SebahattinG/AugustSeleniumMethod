package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_11_LinkTestMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); // to maximize web page
		driver.manage().deleteAllCookies();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
//		By signUp= By.linkText("Sign up");
		By signUpPar = By.partialLinkText("Sign");
		ElementUtil.getElement(driver, signUpPar).click();
		
		
		
		
	}

}

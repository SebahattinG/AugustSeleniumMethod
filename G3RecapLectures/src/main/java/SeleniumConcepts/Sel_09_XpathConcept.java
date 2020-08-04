package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_09_XpathConcept {

	public static void main(String[] args) throws InterruptedException {
		//Xpath is designed to allow the navigation of XML documents/
		//absolute Xpath from the beginning of HTML node 
		//  //Relative Xpath any node of the HTML document
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.linkedin.com/login");
		
//		WebElement username= driver.findElement(By.xpath("//input[@aria-label='Email or Phone']"));
//		username.sendKeys("sebahattin");
//		
//		WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
//		signInButton.click();
		
		Thread.sleep(2000);
		By username= By.xpath("//input[@aria-label='Email or Phone']");
		ElementUtil.getElement(driver, username).sendKeys("sebahattin@hotmail.com");
		
		driver.quit();
		

	}

}

package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_30_ExplicitlyWait {

	public static void main(String[] args) {
		// Works with elements and non elements
		//it waits available in webdriverwait class
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//non-element
		
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		//element
		
		By email= By.id("username");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(email));
		WebElement username=driver.findElement(email);
		username.sendKeys("sebahattin@hotmail.com");
		
		
		//title i yanlis yazarsan TimeOutException verir.
		
		System.out.println("Title is : "+ driver.getTitle());
	}
	
	

}

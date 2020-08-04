package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_09_NameConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
	
		driver.get("http://the-internet.herokuapp.com/login");
		Thread.sleep(4000);
	//First Usage
		WebElement userName= driver.findElement(By.name("username"));
		userName.sendKeys("sebahattin@hotmial.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456");
		//WebElement logBtn= driver.findElement(By.name("loginBtn"));
		//logBtn.click();
	//Second Usage:
//		driver.findElement(By.name("username")).sendKeys("sebahattin@hotmail");

	//Third Usage
		By username= By.name("username");
		WebElement element=driver.findElement(username);
		element.sendKeys("sdfsfsf");
		
	//Fourth 
		ElementUtil.getElement(driver, username).sendKeys("werwrw");
		
		
		
		
		
		
		

	}

}

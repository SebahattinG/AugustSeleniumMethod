package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.util.jar.pack.DriverResource;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_07_NameConcept {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
//		
//		driver.get("https://www.linkedin.com/login");
//		WebElement username= driver.findElement(By.name("session_key"));
//		username.sendKeys("sebahattin@hotmail.com");
//		WebElement passsword= driver.findElement(By.name("session_password"));
//		passsword.sendKeys("1234567");
//		WebElement signiButton= driver.findElement(By.xpath("//button[@type='submit']"));
//		signiButton.click();
		
		driver.findElement(By.name("session_key"));
		
		//3.
		By username= By.name("session_key");
		driver.findElement(username).sendKeys("Sebahattin@hotmail.com");
		//4. Elemenutil
		
	
		
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}

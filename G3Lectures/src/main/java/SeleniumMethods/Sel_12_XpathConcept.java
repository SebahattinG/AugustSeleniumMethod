package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_12_XpathConcept {

	public static void main(String[] args) throws InterruptedException {
		
	//X path is used to find the location of the webpage 
	//	Absolute (/), Relative(//) we always prefer Relative one
		
		//Tocustomize xpath: //tagname[@attributeName='value']
		
			// //input[@id='usernmae']
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
//		WebElement userElement= driver.findElement(By.xpath("//input[@id='username']"));
//		userElement.sendKeys("Sebahattin@hotmail.com");
//		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
//		password.sendKeys("12345");
//		WebElement logBtn=driver.findElement(By.xpath("//button[@id='loginBtn']"));
//		logBtn.click();
		
		
		By username= By.xpath("//input[@id='username']");
		By password= By.xpath("//input[@id='password']");
		By loginBtn= By.xpath("//button[@id=‘loginBtn’]");
		ElementUtil.getElement(driver, username).sendKeys("sebahatti@hotmail.com");
		ElementUtil.getElement(driver, password).sendKeys("12345");
		ElementUtil.getElement(driver, loginBtn).click();
	}

}

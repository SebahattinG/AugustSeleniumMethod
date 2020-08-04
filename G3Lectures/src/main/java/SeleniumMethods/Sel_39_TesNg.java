package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_39_TesNg {
	
	public static WebDriver driver;
	By email = By.id("username");
	By password = By.id("password");
	By loginBtn = By.id("loginBtn");
	By bodyText = By.xpath("//div[@class='private-alert__inner']/h5");
	
	@BeforeMethod // before method runs before all test cases
	
	public void setUp() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(7000);
	}
	@Test(priority=2)
	public void invalidCredentials(){
	getElement(driver,email).sendKeys("sebahattin@gmail.com");
	getElement(driver, password).sendKeys("1234567");
	getElement(driver, loginBtn).click();
	String text=getElement(driver, bodyText).getText();
	System.out.println(text);
	Assert.assertEquals(text, "That email address doesn't exist.");
	}
	@Test(priority=1)
	public void getTitle(){
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");

	}
	
	@AfterMethod
	
	public void tearDown(){
		
		driver.quit();
	}
	public static WebElement getElement(WebDriver driver, By locator){
		
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
		WebElement element= driver.findElement(locator);
		return element;
		}
	
	
	
	
}

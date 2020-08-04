package SeleniumMethods;

import javax.swing.text.Position.Bias;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_50_TestNg2 {

	
	public static WebDriver driver;
	ElementUtil elementUtil;
	/*
	 * ElementUtil de driver ihtiyaci var
		Constructor unda driver var
		direk cagiramiyoruz
	 */
	
	//locators
	By email= By.id("username");
	By password = By.id("password");
	By loginBtn = By.id("loginBtn");
	By bodyText = By.xpath("//div[@class='private-alert__inner']/h5");
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		driver= ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, "https://app.hubspot.com/login");
		Thread.sleep(5000);
		}
	
	@Test(priority=1, description= "Invalid Credentials")
	
	public void invalidCredentials(){
		ElementUtil.getElement(driver, email).sendKeys("sebahattin@hotmail.com");
		ElementUtil.getElement(driver, password).sendKeys("1234566");
		ElementUtil.getElement(driver, loginBtn).click();
		String text= ElementUtil.getElement(driver, bodyText).getText();
		System.out.println(text);
		Assert.assertEquals(text, "That email address doesn't exist.");
		
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		
		ElementUtil.quitBrowser(driver);
	}
	
	
}

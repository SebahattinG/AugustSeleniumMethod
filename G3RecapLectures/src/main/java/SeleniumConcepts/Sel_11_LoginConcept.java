package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Sel_11_LoginConcept {

	static WebDriver driver;
	static By username= By.id("username");
	static By password = By.id("password");
	static By loginBtn= By.className("btn__primary--large");
	
	public static void main(String[] args) {
	driver= ElementUtil.launchBrowser(driver, "chrome");
	
	String url = "https://www.linkedin.com/login";
	
	ElementUtil.launchURL(driver, url);

	
	ElementUtil.sendKeys(driver, username, "sebahattin@hotmail.com");
	ElementUtil.sendKeys(driver, password, "123456");
	ElementUtil.clickOn(driver, loginBtn);
	
	
		
	}

}

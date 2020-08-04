package SeleniumMethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_05_AlertHandling_3 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{

	String url = "https://mail.rediff.com/cgi-bin/login.cgi" ;
	
	By goBtn = By.name("proceed");
	
	//Launch the browser
	
	driver = ElementUtil.launchBrowser(driver,"chrome");
	
	//launch url
	ElementUtil.launchURL(driver, url);
	
	
	//get title
	/**
	 * This method is used to get Title
	 */
	System.out.println(ElementUtil.getPageTitle(driver));
	
	//click on sign in button
	
	ElementUtil.clickOn(driver, goBtn);
	Thread.sleep(4000);
	//handling alert
	String text = ElementUtil.getAlertText(driver);
	if (text.equals("Please enter a valid user name")) {
		System.out.println("correct answer");
		
	}
	else{
		System.out.println("incorrect text");
	}
	
	//Close Browser
	ElementUtil.closeBrowser(driver);
	
	}
	
}

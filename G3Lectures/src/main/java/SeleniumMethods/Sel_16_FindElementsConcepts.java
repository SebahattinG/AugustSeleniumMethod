package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.security.action.GetBooleanAction;

public class Sel_16_FindElementsConcepts {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.com");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		
		//Find Elements == tagName  all links start with "a"
		
		List<WebElement> linklist =driver.findElements(By.tagName("a")); // tag name provides links 
		
		System.out.println("Total links are : "+ linklist.size());
		
		
		for(int i= 0 ; i<linklist.size(); i ++){
			
			String text= linklist.get(i).getText();
			
			System.out.println(text);
			
			
			if (!text.isEmpty()) {
		System.out.println(text);
			
		}
		if (text.equals("Forgot Password")) {
			linklist.get(i).click();
			break;
			
		}
		
		
		}
	
		
		

	}
	

}

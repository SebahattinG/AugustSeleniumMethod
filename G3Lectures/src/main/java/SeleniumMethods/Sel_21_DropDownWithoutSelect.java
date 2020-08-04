package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_21_DropDownWithoutSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> daylist = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(daylist.size());
		for(int i =0 ; i < daylist.size(); i ++){
			
			String text =daylist.get(i).getText();
			System.out.println(text);
			
			if (text.equals("8")) {
				daylist.get(i).click();
				break;
				
			}
			
		}
		
	}

}

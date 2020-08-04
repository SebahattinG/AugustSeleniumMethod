package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Sel_18_DropDown_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sebahattingokaydin/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
			
		WebElement day= driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
//		selectDropDownValueByText(day, "10");
//		selectDropDownValueByText(month, "Mar");
//		selectDropDownValueByText(year, "1999");
		selectDropDownValueByIndex(day, 9);
		
	}
	
	public static void selectDropDownValueByText(WebElement element, String value){
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	public static void selectDropDownValueByIndex(WebElement element, int index){
		Select select =new Select(element);
		select.selectByIndex(index);
		
		
	}
	
}

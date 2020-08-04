package SeleniumMethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_22_IsMultipleMethod {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setHeadless(false);
		driver= new ChromeDriver(chromeOptions);
		
		driver.get("https://www.facebook.com");
		WebElement day= driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select select= new Select(month);
		System.out.println(select.isMultiple());
		
		//To verify
		
		WebElement option = select.getFirstSelectedOption();
		String selectedOption= option.getText();
		
		System.out.println(selectedOption);
		
		Thread.sleep(2000);
		
		
		
		driver.quit();
	}

}

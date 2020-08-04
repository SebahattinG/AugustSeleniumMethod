package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gap.com");
//		Alert alert = driver.switchTo().alert();
//		String alert1= alert.getText();
//		System.out.println(alert1);
		String title= driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		
		WebElement popUp=driver.findElement(By.xpath("//button[@class='css-1qosac6']"));
		popUp.click();
		
		
		WebElement newArrivals = driver.findElement(By.xpath("//a[contains(text(),'New Arrivals')]"));
		
		Select NewArrivals = new Select(newArrivals);
		NewArrivals.selectByVisibleText("Women");;
		
	
	
	
	
	}

}

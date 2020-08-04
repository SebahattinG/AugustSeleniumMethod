package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_35_ElementVisibility {

	public static void main(String[] args) {
		
		//isDisplayed concept
		//isEnabled Concept
		//isSelected concept
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/register");
		
		WebElement submitelement=driver.findElement(By.id("submitButton"));
		System.out.println("Before submit button");
		System.out.println(submitelement.isDisplayed());
		System.out.println(submitelement.isEnabled());
		System.out.println(submitelement.isSelected());
		System.out.println("Line 34 is"+ driver.findElement(By.name("agreeTerms")).isSelected());
		System.out.println("After submit button");
		driver.findElement(By.name("agreeTerms")).click();
		System.out.println(submitelement.isDisplayed());
		System.out.println(submitelement.isEnabled());
		driver.findElement(By.id("submitButton")).click();
		System.out.println(submitelement.isSelected());
		
		
		
	}

}

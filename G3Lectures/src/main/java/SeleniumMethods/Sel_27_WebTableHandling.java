 package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_27_WebTableHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// tr : table roll
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		String beforeXpath= "//*[@id='customers']/tbody/tr[ ";
		String afterXpath = "]/td[1]";
		
		for (int i = 2; i <=7 ; i++) {
			String actualXpath= beforeXpath+ i+ afterXpath;
			System.out.println(actualXpath);
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if (element.getText().equals("Island Trading")) {
				System.out.println("company name : " + element.getText() + "is found " );
				break;
				
			}
			
			
		}
		System.out.println("============================");
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		System.out.println("Contactnames:  ");
		String afterXpathContact = "]/td[2]";
		for (int i = 2; i <=7 ; i++) {
			String actualXpath= beforeXpath+ i+ afterXpath;
			System.out.println(actualXpath);
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			
	
	}
		
		System.out.println("==============================");
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		System.out.println("Contactnames:  ");
		String afterXpathCountry = "]/td[3]";
		for (int i = 2; i <=7 ; i++) {
			String actualXpath= beforeXpath+ i+ afterXpathCountry;
			System.out.println(actualXpath);
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			
	
	}
	
		
		
		

}}

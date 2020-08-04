package SeleniumMethods;

import java.awt.Choice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_26_MultipleDropDown_3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
				
				WebDriver driver= new ChromeDriver();
				driver.get("https://jqueryscript.net/demo/Drop-Down-Combo-Tree/");
				driver.findElement(By.id("justAnInputBox")).click();
				
				selectMultipleDropDown(driver, "choice 2" ,"choice 3", "choice 4");
	
	}
	public static void selectMultipleDropDown(WebDriver driver, String... value){
		List<WebElement> droplist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		for(int i=0 ; i<droplist.size(); i++){
		String text= droplist.get(i).getText();
		System.out.println(text);
		
		//Array 
		for(int j=0; j<value.length; j++){
			
			try {
				if (!text.isEmpty()) {
					if (text.equals(value[j])) {
						droplist.get(i).click();
						break;
						
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		}
		
	}
	

}

package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sel_12_FindElementsConcept {

		static WebDriver driver;
		static List<WebElement> listElements;
	
	
	public static void main(String[] args) {
	driver=ElementUtil.launchBrowser(driver, "chrome");
	ElementUtil.launchURL(driver, "https://www.linkedin.com");
	listElements= driver.findElements(By.tagName("a"));
	System.out.println(listElements.size());
	
	for (int i = 0; i < listElements.size(); i++) {
		String text = listElements.get(i).getText();
//		System.out.println(text);
		if (!text.isEmpty()) {
			System.out.println(text);
		}
		if (text.equals("Careers")) {
			listElements.get(i).click();
			break;
			
		}	
		
	}
	
		
	}

}

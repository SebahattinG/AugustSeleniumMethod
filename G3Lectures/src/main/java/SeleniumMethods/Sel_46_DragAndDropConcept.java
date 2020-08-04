package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_46_DragAndDropConcept {

	public static void main(String[] args) {
		//https://jqueryui.com/resources/demos/droppable/default.html
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement sourceElement= driver.findElement(By.id("draggable"));
		WebElement target =driver.findElement(By.id("droppable"));
		
		Actions actions= new Actions(driver);
		
//		actions.dragAndDrop(sourceElement, target).release().build().perform();
		actions.clickAndHold(sourceElement).moveToElement(target).release().build().perform(); //perform executes last command
		
		
	}

}

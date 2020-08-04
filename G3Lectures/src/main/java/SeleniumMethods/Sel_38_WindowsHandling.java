package SeleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_38_WindowsHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
	
		//getwindowhandle() = get the current window handling
		//getwindowhandles() = get  window handles that opened
		//switchTo().window = switch to between windows
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> iterator=handles.iterator();
		String parentWindowId= iterator.next();
		System.out.println("Parent window id :" + parentWindowId);
		String childID=iterator.next();
		System.out.println("Child Id : "+ childID);
		driver.switchTo().window(childID);
		System.out.println("Child window title is :" + driver.getTitle());
//		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window title is : "+ driver.getTitle());
		
		// driver.quit();
		
	}

}

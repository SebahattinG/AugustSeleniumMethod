package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_04_AlertHandling1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(4000);
	
	//to handle in Selenium, we will use Alert interface
	// we jump onto Alert so that we use switchTo
		Alert alert= driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
	
	if (text.equals("Please enter a valid user name")) {System.out.println("Correct text"+ text);
		
	} else {System.out.println("Wrong text");

	}
	
	alert.accept();
	
//	driver.close();
	
	System.out.println("Test completed");
	
	
	}

}

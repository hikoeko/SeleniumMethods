package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) throws InterruptedException {

		//Implicitly Wait
	
		//This wait tells web driver to wait if the element is not available is immediately and 
		//web driver waits till the element is visible is specified time
		//NoSuchElementException
		//Imp wait works only element - does not work with non-element
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);

		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Title is: = " + driver.getTitle());
		
		//Thread.sleep(5000); only before title

	}

}

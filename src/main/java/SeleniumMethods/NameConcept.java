package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		
		Thread.sleep(2000);
		
		// First Usage 

		//	WebElement userElement = driver.findElement(By.name("username"));
		//	userElement.sendKeys("hikmet@sample.com");
		
	
		//second usage 
		
		//driver.findElement(By.name("username")).sendKeys("hikmet@yahoo.com");;
		
		
		// third ussge
		
		By username = By.name("username");
	//	WebElement userElement = driver.findElement(username);
	//	userElement.sendKeys("asdasd@asd.com");
		
		//fourth usage 
		ElementUtil.getElement(driver, username).sendKeys("lassample@sad.com");
		
	}

}

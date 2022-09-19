package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackAndForward {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);//MS == 2 second
		
		driver.navigate().to("https://amazon.com");
		
		Thread.sleep(2000);//MS == 2 second
		
		driver.navigate().back();
		
		Thread.sleep(2000);//MS == 2 second
		
		driver.navigate().forward();
		
		Thread.sleep(2000);//MS == 2 second
		
		driver.navigate().back();
		
		Thread.sleep(2000);//MS == 2 second
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);//MS == 2 second
		
		driver.quit();
		
		//Get and Navigate 
		
		//get navigates to the web page. Webdriver will wait until the page has fully loaded
		//before returning control script. Get function does not have any method 
		
		//navigate navigates URL. Webdriver will not wait the page has fully loaded
		//navigate function has some methods like back forward refresh
		
	}
}

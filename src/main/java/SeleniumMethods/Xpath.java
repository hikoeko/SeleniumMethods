package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		// /html/body/div/div[1]/div[2]/form/div[3]/div/div/div[2]/input
		
		//*[@id="username"]
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//WebElement userElement = driver.findElement(By.xpath("//input[@id='username']"));
	    //userElement.sendKeys("nabiyevhikmet@gmail.com");
		
		By userName = By.xpath("//input[@id='username']");
		ElementUtil.getElement(driver, userName).sendKeys("ashdhasdj@gmai.com");
		
		
	}

}

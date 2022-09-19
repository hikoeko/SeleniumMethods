package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginDemo {

	public static WebDriver driver;
	
	static By email = By.id("username");
	static By password  = By.xpath("//*[@id='password']");
	static By login = By.cssSelector("#loginBtn");
	

	public static void main(String[] args) throws InterruptedException {
	
		String url = "https://app.hubspot.com/login";
		
		driver = ElementUtil.lauchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		Thread.sleep(5000);  
		
		ElementUtil.getElement(driver, email).sendKeys("ajksdn@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("asda555");
		ElementUtil.getElement(driver, login).click();
		
		ElementUtil.quitBrowser(driver);
		
	}

}

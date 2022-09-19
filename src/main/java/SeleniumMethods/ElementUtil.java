package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementUtil {
	/**
	 * This method is used to handle alert
	 * @param driver
	 * @return
	 */
	
	
	
public static String getAlertText(WebDriver driver){
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}

	// Common selenium methods 

/**
 * 
 * @param driver
 * @param browserName
 * @return
 */
	public static WebDriver lauchBrowser(WebDriver driver, String browserName){
	
	if(browserName.equals("chrome")){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	else if(browserName.equals("firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();

}
	else{
		System.out.println("Browser is not available " + browserName);
	}
	return driver;
}
	public static void launchURL(WebDriver driver, String url){
		driver.get(url);
		
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator){
		WebElement element = driver.findElement(locator);
		return element;
		
				
	}
	/**
	 * 
	 * @param driver
	 * @return
	 */
	
	public static String getPageTitle(WebDriver driver ){
		return driver.getTitle();
		
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 */
	
	public static void clickO(WebDriver driver, By locator){
		driver.findElement(locator).click();
		
	}
	/**
	 * 
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver){
		driver.close();
	}
	/**
	 * 
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver){
		driver.quit();
	}
	
	
}
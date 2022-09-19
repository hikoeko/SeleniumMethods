package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenu3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		selectDropDownValueByText(driver, day, "15");
		selectDropDownValueByText(driver, month, "June");
		selectDropDownValueByText(driver, year, "2008");


		
	}


	public static void selectDropDownValueByText(WebDriver driver, By locator,String value){
		
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByVisibleText(value); 
	}
	public static WebElement getElement(WebDriver driver, By locator){
		WebElement element = driver.findElement(locator);
		return element;
		
	}
	
}

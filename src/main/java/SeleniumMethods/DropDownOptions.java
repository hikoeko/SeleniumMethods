package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		// Select 
		Select select1 = new Select(day);
		
		//Writing all values
		List<WebElement> dayOptions = select1.getOptions();
		System.out.println(dayOptions.size());
		
		for(int i = 0; i<dayOptions.size(); i++){
			System.out.println(dayOptions.get(i).getText());
			
		}
		
		

		
	}

}

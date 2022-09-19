package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenu1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		// Select 
		Select select1 = new Select(day);
		select1.selectByValue("11");
		Select select2 = new Select(month);
		select2.deselectByVisibleText("May");
		Select select3 = new Select(year);
		select3.selectByVisibleText("2011");
		
		
		

		
		
	}

}

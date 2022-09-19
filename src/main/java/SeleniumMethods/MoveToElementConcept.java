package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/course/");	
		
		WebElement contentMenu = driver.findElement(By.className("menulink"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(contentMenu).build().perform();
		
		WebElement coursesLink = driver.findElement(By.linkText("COURSES"));
		coursesLink.click(); //first approach	
		//actions.click(coursesLink);


	}

}

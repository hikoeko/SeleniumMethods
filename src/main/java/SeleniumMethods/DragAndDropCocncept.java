package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropCocncept {

	public static void main(String[] args) throws InterruptedException {
		
		//https://jqueryui.com/resources/demos/droppable/default.html
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
			
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		Thread.sleep(3000);
		
		//actions.dragAndDrop(sourceElement, targetElement).build().perform();
		
		
		//Interview Questions
		//actions
		//.clickAndHold(sourceElemet)
		//.moveToElement(targetElement)
		//.release()
		//.built()
		//.perform()
		
		actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
		
		
		
		
	}

}

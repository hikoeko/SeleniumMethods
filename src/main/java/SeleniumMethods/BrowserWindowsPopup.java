package SeleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowsPopup {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rrc.texas.gov/resource-center/research/gis-viewer/gis-popup-blocker-test/#");
		
		// getwindowHandle() == get the current window handling 
		// getwindowHandels() == get the window handles that opened
		// swtichTo().window() == switch to between windows
		
		driver.findElement(By.xpath("//*[@id='wrapper']/div[1]/div/article/p[3]/a")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		System.out.println("Parent window is: " + parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("Child window is: " + childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println("Child window title is: " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is: " + driver.getTitle());

		driver.close();
		
		
		
		
		
		
	}

}

package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\nabiy\\OneDrive\\Рабочий стол\\sd.txt");
	
		
		
		
		
		
		
		
		Thread.sleep(2200);
		driver.quit();
		
	}

	
}

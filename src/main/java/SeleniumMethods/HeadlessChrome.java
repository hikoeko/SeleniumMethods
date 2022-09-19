package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nabiy\\OneDrive\\Документы\\drivers\\chromedriver.exe" );

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
	}

}

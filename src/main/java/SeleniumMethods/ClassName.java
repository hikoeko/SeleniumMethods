package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//form-control private-form__control login-email
		
		By userName = By.className("login-email");
		ElementUtil.getElement(driver, userName).sendKeys("nabiyevhikmet9@gmail.com");
		
		//form-control private-form__control login-password m-bottom-3
		
		
	}

}

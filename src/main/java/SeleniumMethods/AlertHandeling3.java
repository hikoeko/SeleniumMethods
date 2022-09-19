package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertHandeling3 {
public static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {

		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		
		By goBtn = By.name("proceed");
		
		// launch Browser 
		driver = ElementUtil.lauchBrowser(driver, "chrome");
		
		ElementUtil.launchURL(driver, url);
		
		System.out.println(ElementUtil.getPageTitle(driver));
		
		ElementUtil.clickO(driver, goBtn);
		
		Thread.sleep(4000);
		
		String text = ElementUtil.getAlertText(driver);
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct text");
		}
		else{
			System.out.println("incorrect text");
		}
		ElementUtil.quitBrowser(driver);
		
	}
	

}

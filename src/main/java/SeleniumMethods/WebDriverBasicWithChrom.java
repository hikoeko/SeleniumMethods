package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasicWithChrom {

	public static void main(String[] args) {
		
		//Set property 
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nabiy\\OneDrive\\Документы\\drivers\\chromedriver.exe" );
		
		//Set browser
		
		WebDriver driver = new ChromeDriver();
		// launch browser
		
		driver.get("https://www.siliconelabs.com/");
		
		//get title
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("Silicone Labs")){
			System.out.println("Title is correct");
		}
		else{
			System.out.println("Titile is not correct");
			
			
		}
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
	
		if(url.equals("https://www.siliconelabs.com/")){
			System.out.println("URL is correct");
		}
		else{
			System.out.println("URL is not correct");
			
			
		}	
		driver.close(); //closes current browser 
		
		//driver.quit(); // quite closes ALL browsers	
	}
}

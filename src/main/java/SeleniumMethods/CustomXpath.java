package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) {

		//Xpath is used to find the location of any elements on web page using html structure 
		//Absolute Xpath: starts with single slash(/) starting from root element and all
		//the way to the element
		//Relative Xpath starts with double slash(//) starting selection matching 
		//anywhere in the document 
		//Absolute xpath: html/body/div/div[5]/div[2]/li/div][1]/a
		//Relative xpath : //tagname[@attribute='value']
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver drivr = new ChromeDriver();
		
		// //htmltag[@attribute='value']
		
		// //comant+F or ctrl+F
		
		//  //input[@id='username']-->username
		//  //input[@id='password' and @type='password']-->password
		
		//	//button[@id='loginBtn']--> Login
		//	//button[@id='loginBtn' and @data-test-id='password-login-button']--> Login
		
		//  //input[@name='username'] -->crmpro user
		//  //input[@name='password'] -->crmpro user

		 
		//contains()
		// input[contains(@name,'username')]
		// input[contains(@name,'password')]
		// input[contains(@name,'password')and @type='password']
		// input[@class='btn btn-small' and @value='login']
		// some values are available which return false or true
		//Dynamic xpath
		// <input id=test_123>
		// <input id=test_345>
		//sample  //input[contains(@id, 'test_')]
		 //Contains is used for or dynamic elements properties
		
		//text function 
		
		 //text()
		//  //a[text()='Sign up']
		//	//i18n-string[text()='Sign up']
		//	//a//i18n-string[text()='Sign up']
		//	//i18n-string[text()='Privacy Policy']
		
		//	//h2[text()]
		//	//h2[contains(text().'That email address doesn't exist.')]
		
		//start-with function 
		
		//input[start-with(@id,'username')]
		//input[ends-with(@id,'test_ ')]

		
		//ends-with function 
			//<input id=test_123>
			//<input id =123_test>
		//input[ends-with(@id,'_test')]
		
		//position-- index number
		
		//	(//input[contains(@class, 'form-control')])[1] --> username
		// (//input[contains(@class, 'form-control')])[2] --> password
		//	(//input[contains(@class, 'form-control')])[position()=1]
		//	(//input[contains(@class, 'form-control')])[position()=2]
		
		//parent and child tags in html
		
		//div[contains(@class,'private-form__input-wrapper')]/input[@id='username'] --> direct child 
		//div[contains(@class,'private-form__input-wrapper')]/input[@id='password'] --> direct child
		//div[@class='private-form__set m-bottom-4']/input[@id='username']
		
		//following ::
		
		//div[@class='private-form__control-wrapper']//following::input[@id='remember']
		//div[@class='private-form__control-wrapper']//following::input[@id='password']
		//div[@class='private-form__control-wrapper']//following::input[@id='remember']
		
		//preceding ::
		
		//input[@id='password']/preceding::div[@class='private-form__control-wrapper']
		//input[@id='username']/preceding::div[@class='private-form__control-wrapper']
		
		//child to parent
		//input[@name='username']/../../../../../../..
		//input[@name='username']//parent::div
		//input[@name='username']//parent::div//parent::form
		
		//last()
		// (//input[@type='text'])[last()] --> to reach last index
		
		//ancestor
		//input[@id='uid-firstName-6']//ancestor::body --> grandpa
		
		    
		
	}

}

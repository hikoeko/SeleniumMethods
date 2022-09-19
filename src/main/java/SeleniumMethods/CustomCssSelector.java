package SeleniumMethods;

public class CustomCssSelector {

	public static void main(String[] args) {

		//XPath is slower than CSS
		//CSS is faster then XPath
		//XPath allows very precise locators
		//CSS allows for selection of elements by their surrounding context
		//XPtah relies on browser's XPath implementation which is not always complete
		//CSS provides a good balance between structure and attributes
		//CSS does not provide sibling, parents, preceding etc
		
		//XPath
		//input[@id='username']
		//input[@id='username' and @type='email']
		
		//CSS
		// #username
		//input[id='username'][type='email'] 
		//input.form-control.private-form__control.login-email --> with using point (.)
		//button[id='loginBtn']
		//input.form-control.private-form__control.login-password.m-bottom-3 
		//input.m-bottom-3
		//button.login-submit-- shorter CSS
		
		//Dynamic elements 
		// <input id=test_123>
		// <input id=test_345>
		
		// input[id*='username'] --contains
		// input[id^='username'] --starting text
		// input[id$='username'] --ending text
		///div>input[id='username'] --parent child relationship
		
				
	}

}

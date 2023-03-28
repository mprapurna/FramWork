package com.frame.automation.events;

import com.frame.automation.elements.HomePageElements;
import com.frame.automation.elements.LoginPageElements;
import com.frame.automation.utilities.ElementFetch;

public class HomePageEvents implements HomePageElements{
	ElementFetch fetch ;
	public void clickOnSignIn() {
		fetch=new ElementFetch();
		fetch.getWebElement("ID", username).sendKeys("xyz@gmail.com");
		fetch.getWebElement("ID", password).sendKeys("xyz12345");
		fetch.getWebElement("CLASSNAME", "signin-button").click();
	}
	
}

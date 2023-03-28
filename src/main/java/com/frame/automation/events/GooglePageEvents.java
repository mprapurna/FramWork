package com.frame.automation.events;

import com.frame.automation.elements.GooglePageElements;
import com.frame.automation.elements.LoginPageElements;
import com.frame.automation.utilities.ElementFetch;

public class GooglePageEvents implements GooglePageElements{
	ElementFetch fetch ;
	public void clickonSpecificSearch(String number) {
		fetch=new ElementFetch();
		fetch.getWebElement("Name", textarea).sendKeys("infosys");
		String searchdata=String.format(searchlist,number);
		fetch.getWebElement("XPATH",searchdata).click();
		//fetch.getWebElement("CLASSNAME", "signin-button").click();
	}
	
}

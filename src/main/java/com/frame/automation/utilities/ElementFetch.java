package com.frame.automation.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.frame.automation.Base.*;

public class ElementFetch {
	WebDriverWait wait;
public  WebElement getWebElement(String idType, String idValue) {
	switch(idType) {
	case "ID":
		try {
			return Base.driver.findElement(By.id(idValue));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	case "XPATH":
		return Base.driver.findElement(By.xpath(idValue));
	case "CSS":
		return Base.driver.findElement(By.cssSelector(idValue));
	case "TAG":
		return Base.driver.findElement(By.tagName(idValue));
	case "CLASSNAME":
		return Base.driver.findElement(By.className(idValue));
	case "Name":
		return Base.driver.findElement(By.name(idValue));
	default:
		return null;
	}
	}
	
	public  List<WebElement> getWebElements(String idType, String idValue) {
		switch(idType) {
		case "ID":
				return Base.driver.findElements(By.id(idValue));
		case "XPATH":
			return Base.driver.findElements(By.xpath(idValue));
		case "CSS":
			return Base.driver.findElements(By.cssSelector(idValue));
		case "TAG":
			return Base.driver.findElements(By.tagName(idValue));
		default:
			return null;
		}
	}

		
		public  List<WebElement> findElements(By element ) {
			
		return Base.driver.findElements(element);
	}
		
		public WebElement waitUntilElementLocated(By element) {
			wait = new WebDriverWait(Base.driver, Duration.ofSeconds(30));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		}
	}



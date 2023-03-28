package UI;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import org.testng.asserts.SoftAssert;

import com.frame.automation.Base.Base;

@Listeners(com.frame.automation.utilities.SuiteTestListener.class)	

public class BrowserStackTutorials {
@Test
public void softAssert() {
Base b = new Base();
Base.driver.navigate().to("https://www.browserstack.com/");
String getActualTitle = Base.driver.getTitle();
Boolean verifyTitle = Base.driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
SoftAssert softAssert = new SoftAssert();
softAssert.assertEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
softAssert.assertNotEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
softAssert.assertNull(verifyTitle);
softAssert.assertNotNull(verifyTitle);
softAssert.assertTrue("BrowserStack".equals("Browserstack"), "First soft assert failed");
softAssert.assertFalse("BrowserStack".equals("BrowserStack"), "Second soft assert failed");
softAssert.assertAll(); 
}
}
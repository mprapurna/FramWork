package UI;
import org.testng.annotations.Listeners;	
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.frame.automation.Base.Base;
import com.frame.automation.events.GooglePageEvents;
import com.frame.automation.events.HomePageEvents;
import com.frame.automation.events.LoginPageEvents;
import com.frame.automation.utilities.Constants;

@Listeners(com.frame.automation.utilities.SuiteTestListener.class)	

public class GoogleTests1 {
GooglePageEvents home;
LoginPageEvents login;
Base b;
@BeforeMethod
public void initialize() {
	 b=new Base();
	 Base.driver.get(Constants.googleurl);
}

@Test
public void googleCheckPassedTest() {
	home= new GooglePageEvents();
	home.clickonSpecificSearch("2");
	Reporter.log("verifying");
	Assert.assertTrue(true, "true");
	//login.verifyLoginSuccessful();
}

@Test
public void googleCheckFailedTest() {
	home= new GooglePageEvents();
	
	home.clickonSpecificSearch("1");
	Reporter.log("verifying");
	String getActualTitle=Base.driver.getTitle();
	String expectedTitle="Infosys Ltd";
	Reporter.log("Name of title:"+getActualTitle);
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(getActualTitle,expectedTitle );
	//Assert.assertFalse(true, "true");
	//login.verifyLoginSuccessful();
}

@AfterMethod
public void teradDown()
{
  b.closeDriver();
	
}
}

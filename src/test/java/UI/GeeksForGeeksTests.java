package UI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.frame.automation.Base.Base;
import com.frame.automation.Base.Base2;
import com.frame.automation.events.HomePageEvents;
import com.frame.automation.events.LoginPageEvents;

public class GeeksForGeeksTests {
HomePageEvents home;
LoginPageEvents login;
Base b;
@BeforeMethod
public void initialize() {
	b=new Base();
	Base.driver.get("https://auth.geeksforgeeks.org/");
}

@Test
public void loginCheck() {
	home= new HomePageEvents();
	login = new LoginPageEvents();
	home.clickOnSignIn();
	login.verifyLoginSuccessful();
}

@AfterMethod
public void cleanup() {
	b.closeDriver();
}
}

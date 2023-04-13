package com.frame.automation.Base;

import java.io.File;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.frame.automation.utilities.Constants;
import com.frame.automation.utilities.EventCapture;

public class Base2 {
	public static WebDriver driver;
	
	public Base2(){
		setupDriver("chrome");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://auth.geeksforgeeks.org/");
	//driver.get(Constants.geeksForgeeksurl);
	//driver.get(Constants.googleurl);
		 //driver.get(System.getProperty("login.url"));
	}
public void setupDriver(String browserName) {
	if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chorme.driver", 
				System.getProperty("user.dir")+File.separator+"drivers"+File.separator+"chromedriver.exe");
		/*ChromeOptions options=new ChromeOptions();
		//String url="http://demo.guru99.com/test/simple_context_menu.html";
		options.addArguments("--inconginto");
		//options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--headless");
		options.addArguments("start-maximized");
		//options.addExtensions(new File("C:\\Users\\Admin\\Downloads\\extension_3_1_3_0.crx"));
	    DesiredCapabilities ds=new DesiredCapabilities();
	    ds.setCapability(ChromeOptions.CAPABILITY, options);
	    options.merge(ds);
		driver= new ChromeDriver(options);	*/
		driver= new ChromeDriver();	
	/*	EventFiringWebDriver eventRecorder = new EventFiringWebDriver(driver); 		
	EventCapture eCapture = new EventCapture();
		
	eventRecorder.register(eCapture);*/
	//	driver.get("https://auth.geeksforgeeks.org/");
	}
}
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}


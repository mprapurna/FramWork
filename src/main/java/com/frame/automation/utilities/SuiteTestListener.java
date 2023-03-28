package com.frame.automation.utilities;

import java.io.File;
import java.io.IOException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.apache.commons.io.FileUtils;

import com.frame.automation.Base.Base;

public class SuiteTestListener implements ITestListener{
	@Override		
    public void onFinish(ITestContext arg0) {					
       		
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
      Reporter.log("started");			
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult result) {					
        /*String filename=System.getProperty("user.dir")+
        		File.separator+"screenshots"+File.separator+result.getMethod().getMethodName();
        TakesScreenshot ts= (TakesScreenshot)(Base.driver);
        File f=ts.getScreenshotAs(OutputType.FILE);
        try {
        	FileUtils.copyFile(f,new File(filename+".png"));
        }catch(IOException e) {
        	e.printStackTrace();
        }
        Reporter.log("failed at"+f);*/
    	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) Base.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+dateName+result.getMethod().getMethodName()+".png";
		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("failed at");
		Reporter.log("<a href="+finalDestination.getAbsoluteFile().toURI().toString()+"> clickhere </a>");
    }
    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		
 
    @Override		
    public void onTestStart(ITestResult Result) {
    	Reporter.log("Started test :"+Result.getName(),true);		
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult Result) {					
        // TODO Auto-generated method stub	
    	Reporter.log("The name of the testcase passed is :"+Result.getName(),true);		
    }		

}

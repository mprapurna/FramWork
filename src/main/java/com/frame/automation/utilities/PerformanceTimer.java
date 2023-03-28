package com.frame.automation.utilities;

public class PerformanceTimer {
public static void wait(Long timeunits) {
	try {
		Thread.sleep(timeunits);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
}

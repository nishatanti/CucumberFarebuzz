package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	WebDriver driver;
	
	@Before
	public void setup() {
	System.out.println("LAUNCH URL OF Website");
	
	}
	
	@After	
	public void teardown(Scenario scenario) throws IOException {
		
		System.out.println("close browser");
		if (scenario.isFailed()) {
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			
			FileUtils.copyFile(scrFile, new File("D:\\EclipseProjectWorkspace\\FareBuzzSuite_Cucumber\\Screenshots\\Test.png"));		
			}
		
	
	}

}

package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class support {


	WebDriver driver;

	public support()
	{

	}

	public void ExplicitwaitLocator( WebDriver driver, By Locator, int TimeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver,TimeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}


	public void ExplicitwaitElement( WebDriver driver, WebElement element, int TimeOut)
	{

		WebDriverWait wait = new WebDriverWait(driver,TimeOut);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}



	public void ExplicitwaitLocator3(WebDriver driver, By id,int TimeOut) {

		WebDriverWait wait = new WebDriverWait(driver,TimeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(id));

	}


	public void takeSnapShot(WebDriver driver, String fileWithPath) throws IOException {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);

		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void ExplicitwaitLocator2(WebDriver driver, By xpath, int TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver,TimeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));

	}

//	public void ExplicitwaitLocator4(WebDriver driver, By XPATH, int TimeOut) {
//		WebDriverWait wait = new WebDriverWait(driver,TimeOut);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(XPATH));
//		
//	}





}

package StepDefinition1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory1.MSW_Page;
import Utility.support;

public class MSW_Steps extends support {
	WebDriver driver;
	
	MSW_Page msw;
	support supp = new support();
	
//	@Before
//	public void setup() {
//	System.out.println("LAUNCH URL OF Website");
//	
//	}
//	
//	@After	
//	public void teardown(Scenario scenario) throws IOException {
//		
//		System.out.println("close browser");
//		if (scenario.isFailed()) {
//			
//			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			
//			FileUtils.copyFile(scrFile, new File("D:\\EclipseProjectWorkspace\\FareBuzzSuite_Cucumber\\Screenshots\\Test.png"));		
//			}
//		
//	
//	}
	
	
	@Given("User is on ListingPage")
	public void user_is_on_ListingPage() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjectWorkspace\\FareBuzzSuite_Cucumber\\Drivers\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://www.farebuzz.com/obe/Air/RemoteSearch/?&d1=ORD&r1=MSP&dt1=8/23/2020&tm1=1100&d2=MSP&r2=ORD&dt2=8/30/2020&tm2=1100&ad=1&sr=0&ch=0&yt=0&il=0&is=0&ki=0&class=1&ns=False&childAge=");
		driver.manage().window().maximize();
	}

	@When("enter new source and destination city")
	public void enter_new_source_and_destination_city() {
		msw = new MSW_Page(driver);
		msw.enter_mswtxtSource();
		msw.enter_mswtxtDestination();
		
	}

	@And("enter new depart and return date")
	public void enter_new_depart_and_return_date() {
		msw = new MSW_Page(driver);
		msw.click_mswclickCalender();
		msw.select_mswdepartdate();
		msw.select_mswreturndate();
		//msw.select_mswcloseCalender();
	}

	@And("enter pax count and class")
	public void enter_pax_count_and_class() {
		msw = new MSW_Page(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		msw.enter_mswddlAdults();
		
		msw.enter_mswddlClass();
	}

	@And("click on msw search btn")
	public void click_on_msw_search_btn() {
		msw = new MSW_Page(driver);
		msw.click_mswbtnSearch();
	}

	@Then("user navigate to listing page with new search")
	public void user_navigate_to_listing_page_with_new_search() {
		msw = new MSW_Page(driver);
		By XPATH = By.xpath("//button[@class='cta-1st select__cta']");
		supp.ExplicitwaitLocator2(driver, XPATH, 40);
		driver.close();
		driver.quit();
	}


}

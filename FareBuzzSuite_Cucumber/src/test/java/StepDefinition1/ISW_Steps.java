package StepDefinition1;

//import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageFactory1.ISW_Page;

import Utility.support;

public class ISW_Steps extends support {
		
    WebDriver driver = null;
	ISW_Page iswpage;
	public support supp = new support();
	
//	@Before
//	public void setup() {
//	System.out.println("launch URL");
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
//		driver.close();
//	
//	}
		
	@Given("User is on HomePage")
	public void user_is_on_HomePage() throws IOException {
		//try {
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjectWorkspace\\FareBuzzSuite_Cucumber\\Drivers\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://farebuzz.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	    
//		}
//		catch(Exception e) {
//			System.out.println("Test case failed");
//			supp.takeSnapShot(driver,"D:\\EclipseProjectWorkspace\\FareBuzzSuite_Cucumber\\Screenshots\\Test.png");
//		}
			
	}

	@When("select roundtrip button")
	public void select_roundtrip_button() throws IOException {
		
		iswpage = new ISW_Page(driver);
		iswpage.select_btnroundtrip();

	}

	@And("enter source and destination city")
	public void enter_source_and_destination_city() throws IOException {
		
		iswpage = new ISW_Page(driver);
		iswpage.enter_txtSource();
	    iswpage.enter_txtDestination();

	}

	@And("enter depart and return date")
	public void enter_depart_and_return_date() throws IOException {
	
		iswpage = new ISW_Page(driver);
		iswpage.enter_txtDeptDate();
	    iswpage.enter_txtReturnDate();

	}

	@And("enter passenger count and class")
	public void enter_passenger_count_and_class() throws IOException {
	
	   iswpage = new ISW_Page(driver);
	   iswpage.enter_ddlAdults();
	   iswpage.enter_ddlClass();

	}

	@And("click on enter button")
	public void click_on_enter_button() throws IOException {
		
		iswpage = new ISW_Page(driver);
	    iswpage.Click_btnSearch();
	}
	

	@Then("user is navigated to listing page")
	public void user_is_navigated_to_listing_page() {
		//driver.iswpage = new ISW_Page(driver);
		
	    By XPATH = By.xpath("//button[@class='cta-1st select__cta']");	    
	    supp.ExplicitwaitLocator2(driver, XPATH, 40);
	    //driver.close();
	    driver.quit();
	}

	@When("select onewaytrip button")
	public void select_onewaytrip_button() {
		iswpage = new ISW_Page(driver);
	    iswpage.select_btnonewaytrip();
	}

	@And("enter depart date")
	public void enter_depart_date() {
		iswpage = new ISW_Page(driver);
		iswpage.enter_txtDeptDate();
	}

	@When("select multicitytrip button")
	public void select_multicitytrip_button() {
		iswpage = new ISW_Page(driver);
	    iswpage.select_btnmulticitytrip();
	}

	@And("enter source and destination city for flight1")
	public void enter_source_and_destination_city_for_flight1() {
		iswpage = new ISW_Page(driver);
		iswpage.enter_txtSource();
	    //iswpage.enter_txtDestination();
	    iswpage.enter_txtDestinationMulticity();
	    
	}

	@And("enter depart date for flight1")
	public void enter_depart_date_for_flight1() {
		iswpage = new ISW_Page(driver);
	    iswpage.enter_txtDeptDate();
	}

	@And("enter source and destination city for flight2")
	public void enter_source_and_destination_city_for_flight2() {
		iswpage = new ISW_Page(driver);
		iswpage.enter_txtSource2();
	    iswpage.enter_txtDestination2();
	    
	}

	@And("enter depart date for flight2")
	public void enter_depart_date_for_flight2() {
		iswpage = new ISW_Page(driver);
		iswpage.enter_txtDeptDate2();
	}
	
	

	}
	

	



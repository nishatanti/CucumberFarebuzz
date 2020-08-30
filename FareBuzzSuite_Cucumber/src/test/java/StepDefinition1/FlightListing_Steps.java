package StepDefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.support;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory1.FListing_fliter_Page;

public class FlightListing_Steps {
	WebDriver driver;
	public support supp = new support();
	FListing_fliter_Page FLFliterrepo ;
	
	@Given("User is On HomePage")
	public void user_is_On_HomePage() {
        System.setProperty("webdriver.chrome.driver","D:\\EclipseProjectWorkspace\\FareBuzzSuite_Cucumber\\Drivers\\ChromeDriver1\\chromedriver.exe");	    
	    driver = new ChromeDriver();
	    driver.get("http://farebuzz.com");
	    driver.manage().window().maximize();
	}

	@Given("Enter all the details of ISW")
	public void enter_all_the_details_of_ISW() {
		FLFliterrepo = new FListing_fliter_Page(driver);
		FLFliterrepo.select_btnroundtrip();
		FLFliterrepo.enter_txtSource();
		FLFliterrepo.enter_txtDestination();
		FLFliterrepo.enter_txtDeptDate();
		FLFliterrepo.enter_txtReturnDate();
		FLFliterrepo.enter_ddlAdults();
		FLFliterrepo.enter_ddlClass();
		
	}

	@Given("Click on search button")
	public void click_on_search_button() {
		FLFliterrepo = new FListing_fliter_Page(driver);
		FLFliterrepo.Click_btnSearch();
	}

	@Given("User is navigated to listing page")
	public void user_is_navigated_to_listing_page() {
		By XPATH = By.xpath("//button[@class='cta-1st select__cta']");	    
	    supp.ExplicitwaitLocator2(driver, XPATH, 40);
	}


	@When("Click on going slider from left")
	public void click_on_going_slider_from_left() throws InterruptedException {
		FLFliterrepo = new FListing_fliter_Page(driver);
		FLFliterrepo.GoingSlider();
	}

	@Then("Slider selected time will appear in the contract")
	public void slider_selected_time_will_appear_in_the_contract() {
		FLFliterrepo = new FListing_fliter_Page(driver);
		FLFliterrepo.display_flighttime();
		driver.close();
		driver.quit();
	}


}

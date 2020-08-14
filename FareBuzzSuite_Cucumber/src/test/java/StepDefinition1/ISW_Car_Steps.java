package StepDefinition1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactory1.ISW_Car_Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.support;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ISW_Car_Steps {
	WebDriver driver;
	support supp = new support();
	
	ISW_Car_Page iswcar;

	@Given("User is on HomepagE")
	public void user_is_on_HomepagE() {
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjectWorkspace\\FareBuzzSuite_Cucumber\\Drivers\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://farebuzz.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("Click on car tab")
	public void click_on_car_tab() {
		iswcar = new ISW_Car_Page(driver);
		iswcar.Click_cartab();
	}

	@And("Enter pickup location")
	public void enter_pickup_location() throws InterruptedException {
		iswcar = new ISW_Car_Page(driver);
	   iswcar.Enter_Pickuploc();
	   //Thread.sleep(5000);
	}

	@And("Enter pickup and dropoff date and time")
	public void enter_pickup_and_dropoff_date_and_time() {
		iswcar = new ISW_Car_Page(driver);
	    iswcar.Enter_pickupdate();
	    iswcar.Select_pickuptime();
	    iswcar.Select_pickampm();
	    iswcar.Enter_dropoffdate();
	    iswcar.Select_dropofftime();
	    iswcar.Select_dropampm();
	}

	@And("Click search button")
	public void click_search_button() {
		iswcar = new ISW_Car_Page(driver);
	    iswcar.Enter_carsearchbtn();
	}

	@Then("User navigate to the car listing page")
	public void user_navigate_to_the_car_listing_page() {
		iswcar = new ISW_Car_Page(driver);
	   By XPATH = By.xpath("//button[@class='cta-1st select__cta']");
		supp.ExplicitwaitLocator2(driver, XPATH, 40);
		driver.close();
		driver.quit();
	}

}

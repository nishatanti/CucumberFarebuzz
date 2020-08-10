package StepDefinition1;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.support;

import pageFactory1.ISW_Htl_Page;


public class ISW_Htl_Steps {
	
	WebDriver driver;
	
	support supp = new support();
	
	ISW_Htl_Page iswhtl ;
	//= new ISW_Htl_Page(driver);
	
	@Given("User is on HoMepage")
	public void user_is_on_HoMepage() {
	  
	   System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjectWorkspace\\FareBuzzSuite_Cucumber\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://farebuzz.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@And("click on hotel tab")
	public void click_on_hotel_tab() {
		iswhtl = new ISW_Htl_Page(driver);
		iswhtl.click_hoteltab();
	}

	@When("Enter all the details for hotel search")
	public void enter_all_the_details_for_hotel_search(DataTable table) throws IOException {
		try {
			iswhtl = new ISW_Htl_Page(driver);


			List<Map<String, String>> rows = table.asMaps(String.class,String.class);
			for (Map<String, String> data : rows)
			{
				
				driver.findElement(By.id("txtHotDest")).sendKeys(data.get("Destination"));
				driver.findElement(By.id("txtHotInDate")).clear();
				driver.findElement(By.id("txtHotInDate")).sendKeys(data.get("CheckIn"));
				driver.findElement(By.id("txtHotOutDate")).clear();
				driver.findElement(By.id("txtHotOutDate")).sendKeys(data.get("CheckOut"));
				driver.findElement(By.id("ddlHotelRooms")).click();
				driver.findElement(By.id("ddlHotelRooms")).sendKeys(data.get("Rooms"));
				driver.findElement(By.id("ddlHotR1Adults")).sendKeys(data.get("Adults"));
				driver.findElement(By.id("ddlHotR1Children")).sendKeys(data.get("Children"));
				
				//Thread.sleep(10000);
				
			}
			}
			catch(Exception e) {
				System.out.println("Test case failed");
				//supp.takeSnapShot(driver,"D:\\git\\Cucumber_Framework_FB\\FareBuzzSuite_Cucumber\\Screenshots\\Test.png");
			}
	}

	@And("Click on search button of hotel")
	public void click_on_search_button_of_hotel() {
		iswhtl.click_htlsearchbtn();
	}

	@Then("User navigate to hotel listing page")
	public void user_navigate_to_hotel_listing_page() {
	
		By XPATH = By.xpath("//a[@title='Book Now']");
	    supp.ExplicitwaitLocator2(driver, XPATH, 40);
	    driver.close();
	    driver.quit();
	}

}

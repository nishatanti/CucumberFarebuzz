package StepDefinition1;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory1.BTOBloginPage;
import Utility.support;

public class BTOB_loginStepsPF {

	WebDriver driver = null;
	BTOBloginPage login;
	support supp = new support();



	@Given("user is on home page")
	public void user_is_on_home_page() throws IOException {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\EclipseProjectWorkspace\\FareBuzzSuite_Cucumber\\Drivers\\ChromeDriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://farebuzz.com");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
		catch(Exception e) {
			System.out.println("Test case failed");
			supp.takeSnapShot(driver,"D:\\EclipseProjectWorkspace\\FareBuzzSuite\\ScreenShots\\Test1.png");
		}
	}


	@When("click on Login link")
	public void click_on_Login_link() throws IOException {
		try {
		login = new BTOBloginPage(driver);
		login.click_linkSignIn();
		login.click_tabTravelAgent();
		}
		catch(Exception e) {
			System.out.println("Test case failed");
			supp.takeSnapShot(driver,"D:\\EclipseProjectWorkspace\\FareBuzzSuite\\ScreenShots\\Test2.png");
		}
	}
	
	//DATATABLE EXAMPLE WITHOUT MAPS

	//	@And("enter Username and Password")
	//	public void enter_Username_and_Password() {
	//		login = new BTOBloginPage(driver);
	//	    login.enter_txtUserName();
	//	    login.enter_txtPassword();
	//	}

	//	@And("^enter Username and Password$")
	//	public void enter_Username_and_Password(DataTable table) {
	//		login = new BTOBloginPage(driver);
	//		List<List<String>> data = table.asLists();
	//	      
	//	      driver.findElement(By.id("ctl16_LoginTopMenu1_UserLogin_txtUsername")).sendKeys(data.get(0).get(0));
	//	      driver.findElement(By.id("ctl16_LoginTopMenu1_UserLogin_txtPassword")).sendKeys(data.get(0).get(1));	   
	//	}

	@And("^enter Username and Password$")
	public void enter_Username_and_Password(DataTable table) throws InterruptedException, IOException {
		try {
		login = new BTOBloginPage(driver);


		List<Map<String, String>> rows = table.asMaps(String.class,String.class);
		for (Map<String, String> data : rows)
		{
			driver.findElement(By.id("ctl16_LoginTopMenu1_UserLogin_txtUsername")).sendKeys(data.get("username"));
			driver.findElement(By.id("ctl16_LoginTopMenu1_UserLogin_txtPassword")).sendKeys(data.get("password"));
			login.click_btnB2BSignIn();

			driver.findElement(By.xpath("//img[@class='dropbtn1']")).click();
			driver.findElement(By.xpath("//div[@id='myDropdown']")).click();
			Thread.sleep(10000);
			login.click_linkSignIn();
			login.click_tabTravelAgent();
		}
		}
		catch(Exception e) {
			System.out.println("Test case failed");
			supp.takeSnapShot(driver,"D:\\EclipseProjectWorkspace\\FareBuzzSuite\\ScreenShots\\Test2.png");
		}

	}

	@And("click on Login button")
	public void click_on_Login_button() throws InterruptedException {
		//login = new BTOBloginPage(driver);
		//login.click_btnB2BSignIn();
		Thread.sleep(2000);

	}

	@Then("user is navigated to BTOB login page")
	public void user_is_navigated_to_BTOB_login_page() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("welcome to b2b page");
		driver.close();
		driver.quit();
	}

}





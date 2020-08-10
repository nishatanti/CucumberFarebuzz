package StepDefinition1;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class btobHookSteps {
	
	WebDriver driver;

	
//	@Before
//	public void setup() {
//	System.out.println("launch URL");
//	
//	}
//	
//	@After
//	public void teardown(Scenario scenario) {
//		System.out.println("close browser");
//		if (scenario.isFailed()) {
//			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//			try {
//			FileUtils.copyFile(scrFile, new File("D:\\EclipseProjectWorkspace\\FareBuzzSuite_Cucumber\\Screenshots\\Test.png"));
//			} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			}
//			}
//		
//	}

	
		
//==========================
	@Given("click on Loginlink")
	public void click_on_Loginlink() {
	    
	}

	@When("enter uname and pwd")
	public void enter_uname_and_pwd() {
	   
	}

	@And("click on Login btn")
	public void click_on_Login_btn() {
	   
	}

	@Then("user is navigated to btob login page")
	public void user_is_navigated_to_btob_login_page() {
	   
	}


}

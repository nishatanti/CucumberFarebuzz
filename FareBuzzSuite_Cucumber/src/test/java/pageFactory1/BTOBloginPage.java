package pageFactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BTOBloginPage {
	
	WebDriver driver;
	
	public BTOBloginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath ="(//a[@href='#SignIn'])[2]")
	WebElement linkSignIn;
	
	@FindBy(xpath ="(//a[@href='#TASignIn'])[1]")
	WebElement tabTravelAgent;
	
	@FindBy(id="ctl16_LoginTopMenu1_UserLogin_txtUsername")
	WebElement txt_username;

	@FindBy(id="ctl16_LoginTopMenu1_UserLogin_txtPassword")
	WebElement txt_password;
	
	@FindBy(id="ctl16_LoginTopMenu1_UserLogin_cmdLogin")
	WebElement btnB2BSignIn;
	
	
	
	public void click_linkSignIn() {
		linkSignIn.click();	
	} 

	public void click_tabTravelAgent() {
		tabTravelAgent.click();		
	}

	public void enter_txtUserName() {
		txt_username.click();
		txt_username.sendKeys("FBTEST");		
	}

	public void enter_txtPassword() {
		txt_password.click();
		txt_password.sendKeys("FBTEST123");
	}

	public void click_btnB2BSignIn() throws InterruptedException {
		btnB2BSignIn.click();
		Thread.sleep(10000);
	}		


}

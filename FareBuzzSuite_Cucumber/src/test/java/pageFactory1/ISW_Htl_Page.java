package pageFactory1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ISW_Htl_Page {
	
	WebDriver driver;
	
	public ISW_Htl_Page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='li2']")
	WebElement Hotel_tab;
	
	@FindBy(id="txtHotDest")
	WebElement Hotel_Destination;
	
	@FindBy(id="txtHotInDate")
	WebElement Htl_CheckIn;
	
	@FindBy(id="txtHotOutDate")
	WebElement Htl_CheckOut;
	
	//@FindBy(id="ddlHotelRooms")
	//WebElement ddlRooms;
	
	//@FindBy(id="ddlHotR1Adults")
	//WebElement ddlAdults;
	
	@FindBy(id="ddlHotR1Children")
	WebElement ddlChildren;
	
	@FindBy(xpath="//button[@onclick=' searchHot()']")
	WebElement htlsearchbtn;
	
	
	
	
	//Actions
	public void click_hoteltab() {
		Hotel_tab.click();
	}
	
	
	public void enter_txtHotDest() {
		Hotel_Destination.sendKeys("LAX");
	}
	
	public void enter_Htl_CheckIn() {
		Htl_CheckIn.sendKeys("8/24/2020");
	}
	
	public void enter_Htl_CheckOut() {
		Htl_CheckOut.sendKeys("8/31/2020");
	}
	
	public void select_ddlRooms() {
		//ddlRooms.sendKeys("8/31/2020");
		Select ddlRooms = new Select(driver.findElement(By.id("ddlHotelRooms")));
		ddlRooms.selectByValue("1");		
	}
	
	public void select_ddlAdults() {
		Select ddlAdults = new Select(driver.findElement(By.id("ddlHotR1Adults")));
		ddlAdults.selectByValue("2");
	}
	
	public void select_ddlChild() {
		ddlChildren.sendKeys("1");
	}
	
	public void click_htlsearchbtn() {
		htlsearchbtn.click();
	}
	
	
	

}

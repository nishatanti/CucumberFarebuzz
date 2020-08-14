package pageFactory1;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ISW_Page {
	
WebDriver driver;
	
	public ISW_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="rbAirRT")
	WebElement btnroundtrip;
	
	@FindBy(id="rbAirOW")
	WebElement btnonewaytrip;
	
	@FindBy(id="rbAirMC")
	WebElement btnmulticitytrip;
	
	@FindBy(id="txtAirFrom")
	WebElement txtSource;
	
	@FindBy(id="txtAirTo")
	WebElement txtDestination;
	
	@FindBy(id="txtAirFrom2")
	WebElement txtSource2;
	
	@FindBy(id="txtAirTo2")
	WebElement txtDestination2;
	
	@FindBy(id="txtAirDepDate")
	WebElement txtDeptDate;
	
	@FindBy(id="txtAirDepDate2")
	WebElement txtDeptDate2;
	
	@FindBy(id="txtAirRetDate")
	WebElement txtReturnDate;
	
	
	
	@FindBy(id="ddlAirAdults")
	WebElement ddlAdults;
	
	@FindBy(id="ddlAirSeniors")
	WebElement ddlSeniors;
	
	@FindBy(id="ddlAirChildren")
	WebElement ddlChildren;
	
	@FindBy(id="FL1KV1a")
	WebElement ddlAgeofChildren;
	
	
	@FindBy(id="ddlAirClass")
	WebElement ddlClass;
	
	@FindBy(xpath="//button[@clas='btn']")
	WebElement btnSearch;
	
	@FindBy(id="txtAirTo")
	WebElement txtDestinationMulticity;
	
	
	
	public void select_btnroundtrip() {
		btnroundtrip.click();	
	} 
	
	public void select_btnonewaytrip() {
		btnonewaytrip.click();	
	} 
	
	public void select_btnmulticitytrip() {
		btnmulticitytrip.click();	
	} 
	
	public void enter_txtSource() {
		txtSource.click();
		txtSource.sendKeys("ORD");
		txtSource.sendKeys(Keys.TAB);
	}
	
	public void enter_txtDestination() {
		//txtDestination.click();	
		txtDestination.sendKeys("MSP");
		txtDestination.sendKeys(Keys.TAB);
	} 
	
	public void enter_txtDestinationMulticity() {
		//txtDestination.click();	
		txtDestinationMulticity.sendKeys("MSP");
		txtDestinationMulticity.sendKeys(Keys.TAB);
	} 
	
	public void enter_txtSource2() {
		txtSource2.click();
		txtSource2.sendKeys("MSP");
		
	}
	
	public void enter_txtDestination2() {
		txtDestination2.click();	
		txtDestination2.sendKeys("NYC");
	} 

    public void enter_txtDeptDate() {
    	txtDeptDate.click();
    	txtDeptDate.clear();
    	txtDeptDate.sendKeys("8/20/2020");
    }
    
    public void enter_txtReturnDate() {
    	txtReturnDate.clear();
    	txtReturnDate.sendKeys("8/25/2020");
    }
    
    public void enter_txtDeptDate2() {
    	txtDeptDate2.sendKeys("8/30/2020");
    }
         
    public void enter_ddlAdults() {
    	ddlAdults.sendKeys("2");
    }
    
    public void enter_ddlSeniors() {
    	ddlSeniors.sendKeys("2");
    }
    
    public void enter_ddlChildren() {
    	ddlSeniors.sendKeys("1");
    }
    
    public void select_ddlAgeofChildren() {
    	ddlAgeofChildren.sendKeys("1");
    }
       
    public void enter_ddlClass() {
    	ddlClass.sendKeys("Business");
    }
    
    public void Click_btnSearch() {
    	btnSearch.click();
    }    
}

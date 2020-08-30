package pageFactory1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FListing_fliter_Page {

	WebDriver driver;
	
	public FListing_fliter_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="rbAirRT")
	WebElement btnroundtrip;
	
	@FindBy(css="#txtAirFrom")
	WebElement txtSource;
	
	@FindBy(css="#txtAirTo")
	WebElement txtDestination;
	
	@FindBy(id="txtAirDepDate")
	WebElement txtDeptDate;
	
	@FindBy(id="txtAirRetDate")
	WebElement txtReturnDate;
	
	@FindBy(id="ddlAirAdults")
	WebElement ddlAdults;
	
	@FindBy(id="ddlAirClass")
	WebElement ddlClass;
	
	@FindBy(xpath="(//button [@type ='button'])[3]")
	WebElement btnSearch;
	
	public void select_btnroundtrip() {
		btnroundtrip.click();	
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
	
    public void enter_txtDeptDate() {
    	txtDeptDate.click();
    	txtDeptDate.clear();
    	txtDeptDate.sendKeys("9/20/2020");
    }
    
    public void enter_txtReturnDate() {
    	txtReturnDate.clear();
    	txtReturnDate.sendKeys("9/25/2020");
    }   
         
    public void enter_ddlAdults() {
    	ddlAdults.click();
    	ddlAdults.sendKeys("2");
    }
    
       
    public void enter_ddlClass() {
    	ddlClass.sendKeys("Business");
    }
    
    public void Click_btnSearch() {
    	btnSearch.click();
    }    
	@FindBy(xpath="(//time[@class='airport__time'])[1]")
	WebElement flighttime;
	
	public void display_flighttime()
	{
		flighttime.isDisplayed();
	}
	
	
	//assertTrue(priceSlider.isDisplayed());
	public void GoingSlider() throws InterruptedException {    
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    WebElement a = driver.findElement(By.xpath("//div[@id='slider-1']/a"));
//
//    js.executeScript("arguments[0].setAttribute('style', 'left: 30%;')",a);
    
    WebElement slider1 = driver.findElement(By.cssSelector("#DivDepart > div > div > div.slider-track > div:nth-child(2)"));
    Actions move1 = new Actions(driver);
    move1.dragAndDropBy(slider1, 90, 0);
    move1.build().perform();
    Thread.sleep(5000);
	}
	
	
}

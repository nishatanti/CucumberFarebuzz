package pageFactory1;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MSW_Page {
	
	WebDriver driver;
	
	public MSW_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@id='ember367'])[1]")
	WebElement mswtxtSource;

	@FindBy(xpath="(//input[@id='ember383'])[1]")
	WebElement mswtxtDestination;
	
	@FindBy(id="DepartFieldControl")
	WebElement mswclickCalender;
	
	@FindBy(xpath="//*[@id='calendarCompId']/section/div/div[2]/ol/div[5]/li")
	WebElement mswselectdepartdate;
	
	@FindBy(xpath="//*[@id='calendarCompId']/section/div/div[2]/ol/div[13]/li")
	WebElement mswselectreturndate;
	
	@FindBy(xpath="(//a[@href='#'])[5]")
	WebElement mswcloseCalender;
	
	@FindBy(id="ember416")
	WebElement mswddlAdults;
	
    @FindBy(id="ember426")
    WebElement mswddlClass;
	
    @FindBy(xpath="//button[@id='startSearchButton']")
    WebElement mswbtnSearch;
	
    public void enter_mswtxtSource() {
		mswtxtSource.click();
		mswtxtSource.sendKeys("NYC");
		mswtxtSource.sendKeys(Keys.TAB);
	}
    
    public void enter_mswtxtDestination() {
		//txtDestination.click();	
		mswtxtDestination.sendKeys("LHR");
		mswtxtDestination.sendKeys(Keys.TAB);
	} 
	
	public void click_mswclickCalender() {
		mswclickCalender.click();
	}
	
	public void select_mswdepartdate() {
		mswselectdepartdate.click();
	}
	
	public void select_mswreturndate() {
		mswselectreturndate.click();
	}
	
	public void select_mswcloseCalender() {
		mswcloseCalender.click();
		mswcloseCalender.sendKeys(Keys.TAB);
		mswcloseCalender.sendKeys(Keys.TAB);
		mswcloseCalender.sendKeys(Keys.TAB);
	}
	
	public void enter_mswddlAdults() {
		mswddlAdults.click();
		mswddlAdults.sendKeys("3");
	}
	
	public void enter_mswddlClass() {
		mswddlClass.sendKeys(Keys.TAB);
		mswddlClass.sendKeys(Keys.TAB);
		mswddlClass.sendKeys(Keys.TAB);
		mswddlClass.sendKeys(Keys.TAB);
		mswddlClass.sendKeys("Business");
	}
	
	public void click_mswbtnSearch() {
		mswbtnSearch.click();
	}
	
	
}

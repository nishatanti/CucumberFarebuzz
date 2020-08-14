package pageFactory1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class ISW_Car_Page {
	
	WebDriver driver;
	
	
	public ISW_Car_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//li[@id='li4']")
	WebElement Cartab;
	
	@FindBy(id="txtCarLocation")
	WebElement Pickuploc;
	
	@FindBy(id="txtCarPickDate")
	WebElement pickupdate;
	
	@FindBy(id="ddlCarPickTime")
	WebElement pickuptime;
	
	@FindBy(id="ddlCarPickAMPM")
	WebElement pickampm;
	
	@FindBy(id="txtCarDropDate")
	WebElement dropoffdate;
	
	@FindBy(id="ddlCarDropTime")
	WebElement dropofftime;
	
	@FindBy(id="ddlCarDropAMPM")
	WebElement dropampm;
	
	@FindBy(xpath="//button[@onclick=' searchCar()']")
	WebElement carsearchbtn;
	
	public void Click_cartab()
	{
		Cartab.click();
	}
	
	public void Enter_Pickuploc() 
	{
		Pickuploc.sendKeys("LAS");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div [@onmouseover='SuggestMouseOver(this);'])[1]")).click();
		
		Pickuploc.sendKeys(Keys.TAB);
	}
	
	
	
	public void Enter_pickupdate()
	{
		pickupdate.click();
		pickupdate.clear();
		pickupdate.sendKeys("9/2/2020");
	}
	
	public void Select_pickuptime()
	{
		Select ddlpickuptime = new Select(driver.findElement(By.id("ddlCarPickTime")));
		ddlpickuptime.selectByValue("0200");;
	}
	
	public void Select_pickampm()
	{
		
		Select pickampm = new Select(driver.findElement(By.id("ddlCarPickAMPM")));
		pickampm.selectByValue("PM");
	}
	
	public void Enter_dropoffdate()
	{
		dropoffdate.click();
		dropoffdate.clear();
		dropoffdate.sendKeys("9/10/2020");
	}
	
	public void Select_dropofftime()
	{
		Select ddldropofftime = new Select(driver.findElement(By.id("ddlCarDropTime")));
		ddldropofftime.selectByValue("0400");
		
		
	}
	
	public void Select_dropampm()
	{
		
		Select ddldropampm = new Select(driver.findElement(By.id("ddlCarDropAMPM")));
		ddldropampm.selectByValue("PM");
	}
	
	public void Enter_carsearchbtn()
	{
		carsearchbtn.click();
	}

}

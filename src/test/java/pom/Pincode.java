package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pincode {
	
WebDriver driver;
	
	public Pincode (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 driver.navigate().to("https://www.amazon.ca/");
}
	
	//POM
	@CacheLookup
	@FindBy(id="nav-global-location-slot")     //(locators)
	WebElement location;
	
	@CacheLookup
	@FindBy(id="GLUXZipUpdateInput_0")     //(locators)
	WebElement pin;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='a-column a-span4 a-span-last']")     //(locators)
	WebElement inputbtn;
	
	
	
//	@CacheLookup
//	@FindBy(id="twotabsearchtextbox")     //(locators)
//	WebElement searchbtn;
//	
//	@CacheLookup
//	@FindBy(id="nav-search-submit-button")     //(locators)
//	WebElement searchtab;
//	
//	@CacheLookup
//	@FindBy(xpath="//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4'][1]")     //(locators)
//	WebElement item;
//	
//	@CacheLookup
//	@FindBy(xpath="//span[@id='contextualIngressPtLabel']")     //(locators)
//	WebElement itemaddress;
//	
	
	
	public void passpincode(String em) {
		waits(location);
		location.click();
		
		waits(pin);
		pin.click();
		pin.sendKeys(em);
		
		waits(inputbtn);
		inputbtn.click();	
		
	}
	
//	public void dealingwithdelivery() {
//		
//		waits(searchbtn);
//		searchbtn.click();
//		try {
//			searchbtn.sendKeys("iphone 11 pro case");
//		} catch (StaleElementReferenceException e) {
//			
//		}
//		
//		waits(searchtab);
//		searchtab.click();
//		
//		waits(item);
//		try {
//			item.click();
//		} catch (StaleElementReferenceException e) {
//			
//		}
//		
//		waits(itemaddress);
//		itemaddress.getText();
//		System.out.println(itemaddress.getText());
//		
//		
//	}
	
	
	
	public void waits (WebElement ele) {
		WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
		
}

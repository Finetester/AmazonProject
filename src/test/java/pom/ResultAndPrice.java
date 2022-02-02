package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultAndPrice {

WebDriver driver;
	
	public ResultAndPrice (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.navigate().to("https://www.amazon.ca/");
}
	
	//POM 
	
	@CacheLookup
	@FindBy(id="twotabsearchtextbox")     //(locators)
	WebElement searchbtn;
	
	@CacheLookup
	@FindBy(id="nav-search-submit-button")     //(locators)
	WebElement searchtab;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")     //(locators)
	WebElement result;
	
	
	
	
	@CacheLookup
	@FindBy(xpath="//div[@class='a-section aok-relative s-image-square-aspect']")     //(locators)
	WebElement mobileselect;
	
	@CacheLookup
	@FindBy(xpath="//div[@id='corePrice_feature_div']")     //(locators)
	WebElement mobileprice;
	
	public void gettheresults() {
		waits(searchbtn);
		searchbtn.click();
		searchbtn.sendKeys("samsung galaxy s10");
		
		waits(searchtab);
		searchtab.click();
		
		waits(result);
		result.getText();
		System.out.println(result.getText());
		
	}
		
		public void mobile() {
			
		waits(mobileselect);
		mobileselect.click();
		
		waits(mobileprice);
		mobileprice.getText();
		System.out.println(mobileprice.getText());
		
	}
	
	
	
	
	public void waits (WebElement ele) {
		WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	

	
	
}
